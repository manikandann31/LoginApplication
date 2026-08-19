\# LoginApplication



A Java-based web application for user authentication and account management using Java Servlets, JSP, JDBC, MySQL, and Apache Tomcat.



\## Project Overview



LoginApplication allows users to create an account, authenticate using their credentials, and manage their account after successful authentication.



The application provides user registration, login, session management, profile viewing, profile updating, account deletion, and logout functionality.



The project follows a layered architecture that separates the presentation, controller, business logic, and database access responsibilities.



\## Project Demo



🎥 \*\*Complete Application Demo\*\*



\[Watch the LoginApplication Demo](https://youtu.be/RXH22dGsXGE)



The demo demonstrates the complete application workflow, including user registration, login, session-based authentication, profile management, account update, account deletion, and logout.## Features



\- User registration

\- Username existence validation

\- User login with password validation

\- Session-based authentication

\- User dashboard

\- View user profile

\- Update account details

\- Delete account

\- Logout and session termination

\- MySQL database integration using JDBC

\- PreparedStatement-based database operations



\## Technology Stack



| Technology | Usage |

|---|---|

| Java | Application development |

| JSP | User interface |

| Java Servlets | Request and response handling |

| JDBC | Database connectivity |

| MySQL | Data persistence |

| Apache Tomcat | Web application server |

| Maven | Project and dependency management |

| HTML/CSS | Frontend design |

| Eclipse | Development environment |



\## Application Architecture



The application follows a layered architecture:



```text

&#x20;                   User

&#x20;                     |

&#x20;                     v

&#x20;               JSP / HTML / CSS

&#x20;                     |

&#x20;                     v

&#x20;                 Controller

&#x20;                 (Servlets)

&#x20;                     |

&#x20;                     v

&#x20;               Service Layer

&#x20;               (Business Logic)

&#x20;                     |

&#x20;                     v

&#x20;                 DAO Layer

&#x20;               (Database Logic)

&#x20;                     |

&#x20;                     v

&#x20;                   JDBC

&#x20;                     |

&#x20;                     v

&#x20;                MySQL Database

