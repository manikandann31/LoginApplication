package userDao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import model.User;

public class userDao {

    private Properties properties = new Properties();

    // Load database configuration when DAO object is created
    public userDao() {

        try (InputStream input =
                getClass().getClassLoader()
                        .getResourceAsStream("db.properties")) {

            if (input == null) {
                throw new RuntimeException("db.properties not found");
            }

            properties.load(input);

            // Explicitly load MySQL driver
            Class.forName("com.mysql.cj.jdbc.Driver");

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Unable to load database configuration"
            );
        }
    }

    public boolean registerUser(User user) {

        String sql =
                "INSERT INTO userss(username, password, email, phone) " +
                "VALUES (?, ?, ?, ?)";

        try (
            Connection con = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getEmail());
            ps.setLong(4, user.getPhone());

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }



    public boolean isUserExist(String username) {

        String sql =
                "SELECT username FROM userss WHERE username = ?";

        try (
            Connection con = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {

                return rs.next();
            }

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }


    public boolean validatePassword(
            String username,
            String password) {

        String sql =
                "SELECT password FROM userss WHERE username = ?";

        try (
            Connection con = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    String dbPassword =
                            rs.getString("password");

                    return dbPassword.equals(password);
                }

                return false;
            }

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }


    public User getUser(String username) {

        String sql =
                "SELECT * FROM userss WHERE username = ?";

        try (
            Connection con = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, username);

            try (ResultSet rs = ps.executeQuery()) {

                if (rs.next()) {

                    User user = new User();

                    user.setUsername(
                            rs.getString("username")
                    );

                    user.setPassword(
                            rs.getString("password")
                    );

                    user.setEmail(
                            rs.getString("email")
                    );

                    user.setPhone(
                            Long.parseLong(
                                    rs.getString("phone")
                            )
                    );

                    return user;
                }

                return null;
            }

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }


    public boolean updateUser(
            String username,
            String password,
            String email,
            String phone) {

        String sql =
                "UPDATE userss SET password=?, email=?, phone=? " +
                "WHERE username=?";

        try (
            Connection con = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, password);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, username);

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }


    public boolean deleteUser(String username) {

        String sql =
                "DELETE FROM userss WHERE username = ?";

        try (
            Connection con = DriverManager.getConnection(
                    properties.getProperty("db.url"),
                    properties.getProperty("db.username"),
                    properties.getProperty("db.password")
            );

            PreparedStatement ps = con.prepareStatement(sql)
        ) {

            ps.setString(1, username);

            int rows = ps.executeUpdate();

            return rows > 0;

        } catch (Exception e) {

            e.printStackTrace();
            return false;
        }
    }
}