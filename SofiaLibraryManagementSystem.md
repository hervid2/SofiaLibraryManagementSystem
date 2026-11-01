SofiaLibraryManagementSystem/
├── pom.xml
├── README.md
├── .gitignore
└── src/
    ├── main/
    │   ├── java/com/hernancardona/
    │   │   ├── Main.java  <-- Aquí solo arrancas la app (SwingUtilities.invokeLater)
    │   │   │
    │   │   ├── model/
    │   │   │   ├── entity/      <-- Clases mapeadas a BD (@Entity)
    │   │   │   │   ├── UserAccount.java
    │   │   │   │   ├── Member.java
    │   │   │   │   ├── Librarian.java
    │   │   │   │   ├── Category.java
    │   │   │   │   ├── Book.java
    │   │   │   │   ├── BookCopy.java
    │   │   │   │   ├── Loan.java
    │   │   │   │   ├── Reservation.java
    │   │   │   │   └── Fine.java
    │   │   │   └── enums/       <-- Estados (LoanStatus, CopyStatus, etc.)
    │   │   │       ├── UserRole.java
    │   │   │       ├── CopyStatus.java
    │   │   │       ├── LoanStatus.java
    │   │   │       ├── ReservationStatus.java
    │   │   │       └── FineStatus.java
    │   │   │
    │   │   ├── view/            <-- SOLO interfaz gráfica (JFrame, JPanel)
    │   │   │   ├── frames/      <-- Ventanas principales (Dependen del rol)
    │   │   │   │   ├── LoginFrame.java
    │   │   │   │   ├── AdminDashboardFrame.java
    │   │   │   │   ├── LibrarianDashboardFrame.java
    │   │   │   │   └── MemberDashboardFrame.java
    │   │   │   ├── panels/      <-- Paneles que se incrustan en los Dashboards
    │   │   │   │   ├── BookPanel.java
    │   │   │   │   ├── LoanPanel.java
    │   │   │   │   ├── ReservationPanel.java
    │   │   │   │   ├── FinePanel.java
    │   │   │   │   └── UserManagementPanel.java
    │   │   │   └── components/  <-- Componentes reutilizables (Tablas, Botones, Modales)
    │   │   │       ├── CustomTable.java
    │   │   │       └── ModalDialog.java
    │   │   │
    │   │   ├── controller/      <-- Lógica de eventos (ActionListeners)
    │   │   │   ├── AuthController.java
    │   │   │   ├── BookController.java
    │   │   │   ├── MemberController.java
    │   │   │   ├── LibrarianController.java
    │   │   │   ├── LoanController.java
    │   │   │   ├── ReservationController.java
    │   │   │   └── FineController.java
    │   │   │
    │   │   ├── service/         <-- Lógica de negocio (Reglas)
    │   │   │   ├── AuthService.java
    │   │   │   ├── BookService.java
    │   │   │   ├── MemberService.java
    │   │   │   ├── LibrarianService.java
    │   │   │   ├── LoanService.java
    │   │   │   ├── ReservationService.java
    │   │   │   └── FineService.java
    │   │   │
    │   │   ├── repository/      <-- Acceso a datos (JPA/Hibernate)
    │   │   │   ├── UserAccountRepository.java
    │   │   │   ├── BookRepository.java
    │   │   │   ├── BookCopyRepository.java
    │   │   │   ├── CategoryRepository.java
    │   │   │   ├── MemberRepository.java
    │   │   │   ├── LibrarianRepository.java
    │   │   │   ├── LoanRepository.java
    │   │   │   ├── ReservationRepository.java
    │   │   │   └── FineRepository.java
    │   │   │
    │   │   ├── config/          <-- Configuración de infraestructura
    │   │   │   └── JpaUtil.java <-- Manejo del EntityManager
    │   │   │
    │   │   └── exception/       <-- Excepciones personalizadas
    │   │       ├── EntityNotFoundException.java
    │   │       └── BusinessException.java
    │   │
    │   └── resources/
    │       ├── META-INF/
    │       │   └── persistence.xml <-- Configuración de JPA/Hibernate
    │       ├── images/             <-- Iconos para tus JFrame/JPanel
    │       └── styles/             <-- Archivos CSS para Swing (opcional)
    │
    └── test/
        └── java/com/hernancardona/
            ├── service/            <-- Pruebas de lógica de negocio
            └── repository/         <-- Pruebas de base de datos

