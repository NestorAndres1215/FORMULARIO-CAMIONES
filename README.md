# Gestión de Camiones - Interfaz Gráfica en Java

Este proyecto implementa una interfaz gráfica utilizando Java Swing para gestionar información de camiones conectándose a una base de datos Mysql.

---

## **Características principales**

1. **Interfaz gráfica con Swing:**
   - **Tabla (JTable):** Muestra información de los camiones almacenados en la base de datos.
   - **Filtros con JComboBox:** Permite filtrar los camiones por tipo y empresa.
   - **Botones de acción:**
     - Mostrar todos los camiones.
     - Salir de la aplicación.

2. **Conexión con SQLite:**
   - Obtiene información de las tablas `tblcamion` y `empresa`.
   - Utiliza una clase `Cls_Conexion` para gestionar la conexión a la base de datos.

3. **Funciones implementadas:**
   - **`cargarcomboempresa()`:** Carga las empresas disponibles en el `JComboBox` desde la base de datos.
   - **`formComponentShown()`:** Carga y muestra todos los camiones al abrir la ventana.

---

## **Código principal**

```java
import java.awt.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class GestionCamiones extends JFrame {
    private JComboBox<String> comboEmpresa;
    private JTable tablaCamiones;
    private JButton btnMostrarTodos, btnSalir;

    public GestionCamiones() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Gestión de Camiones");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior con filtros
        JPanel panelFiltros = new JPanel(new FlowLayout());
        comboEmpresa = new JComboBox<>();
        panelFiltros.add(new JLabel("Empresa:"));
        panelFiltros.add(comboEmpresa);
        add(panelFiltros, BorderLayout.NORTH);

        // Tabla de camiones
        tablaCamiones = new JTable();
        add(new JScrollPane(tablaCamiones), BorderLayout.CENTER);

        // Panel inferior con botones
        JPanel panelBotones = new JPanel(new FlowLayout());
        btnMostrarTodos = new JButton("Mostrar Todos");
        btnSalir = new JButton("Salir");
        panelBotones.add(btnMostrarTodos);
        panelBotones.add(btnSalir);
        add(panelBotones, BorderLayout.SOUTH);

        // Acciones de los botones
        btnMostrarTodos.addActionListener(e -> mostrarTodosCamiones());
        btnSalir.addActionListener(e -> System.exit(0));

        pack();
        setLocationRelativeTo(null);
    }

    private void mostrarTodosCamiones() {
        try (Connection conn = Cls_Conexion.obtenerConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM tblcamion")) {

            DefaultTableModel model = new DefaultTableModel(new String[]{"ID", "Placa", "Empresa"}, 0);
            while (rs.next()) {
                model.addRow(new Object[]{rs.getInt("id"), rs.getString("placa"), rs.getString("empresa")});
            }
            tablaCamiones.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GestionCamiones().setVisible(true));
    }
}
```

---

## **Mejoras sugeridas**

1. **Manejo de excepciones:**
   Utiliza `JOptionPane` para mostrar errores al usuario en lugar de imprimirlos en consola:
   ```java
   JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
   ```

2. **Cierre de recursos:**
   Asegúrate de cerrar los recursos como `ResultSet` y `Statement` en un bloque `finally` o usando `try-with-resources`.

3. **Modularización del código:**
   Divide las responsabilidades en métodos más pequeños para mejorar la legibilidad y el mantenimiento del código.

4. **Validación de datos:**
   Implementa validaciones en los filtros para evitar errores al consultar la base de datos.

---

## **Estructura de la base de datos**

### Tabla `tblcamion`:
```sql
CREATE TABLE tblcamion (
    id INTEGER PRIMARY KEY,
    placa TEXT NOT NULL,
    empresa TEXT NOT NULL
);
```

### Tabla `empresa`:
```sql
CREATE TABLE empresa (
    id INTEGER PRIMARY KEY,
    nombre TEXT NOT NULL
);
```

---

## **Requisitos del entorno**

1. **JDK 8 o superior.**
2. **MYSQL JDBC Driver:** Descarga el archivo `mysql-jdbc.jar` y agrégalo al classpath del proyecto.
3. **IDE recomendado:** NetBeans, IntelliJ IDEA o Eclipse.

---

## **Ejecución del proyecto**

1. Configura la base de datos SQLite con las tablas mencionadas anteriormente.
2. Agrega el archivo `sqlite-jdbc.jar` al classpath del proyecto.
3. Compila y ejecuta la clase `GestionCamiones`.
