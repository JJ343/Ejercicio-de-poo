
package Principal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class VentanaPrincipal extends JFrame implements
        ActionListener {
    private ListaPersonas lista;
    private Container contenedor;
    private JLabel nombre, apellidos, teléfono, dirección;

    private JTextField campoNombre, campoApellidos, campoTeléfono,
            campoDirección;
    private JButton añadir, eliminar, borrarLista;
    private JList listaNombres;
    private DefaultListModel modelo;
    private JScrollPane scrollLista;

    public VentanaPrincipal(){
        lista = new ListaPersonas();
        inicio();
        setTitle("Personas");
        setSize(350,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
    }

    private void inicio() {
        contenedor = getContentPane();
        contenedor.setLayout(null);
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(20, 25, 200, 23);
        campoNombre = new JTextField();

        campoNombre.setBounds(105, 25, 200, 23);

        apellidos = new JLabel();
        apellidos.setText("Apellidos:");
        apellidos.setBounds(20, 50, 200, 23);
        campoApellidos = new JTextField();
        campoApellidos.setBounds(105, 50, 200, 23);

        teléfono = new JLabel();
        teléfono.setText("Teléfono:");
        teléfono.setBounds(20, 80, 200, 23);
        campoTeléfono = new JTextField();

        campoTeléfono.setBounds(105, 80, 200, 23);

        dirección = new JLabel();
        dirección.setText("Dirección:");
        dirección.setBounds(20, 110, 200, 23);
        campoDirección = new JTextField();

        campoDirección.setBounds(105, 110, 200, 23);

        añadir = new JButton();
        añadir.setText("Añadir");
        añadir.setBounds(105, 150, 100, 23);

        añadir.addActionListener(this);

        eliminar= new JButton();
        eliminar.setText("Eliminar");
        eliminar.setBounds(40, 280, 120, 23);
        eliminar.addActionListener(this);

        borrarLista= new JButton();
        borrarLista.setText("Borrar Lista");
        borrarLista.setBounds(170, 280, 120, 23);

        borrarLista.addActionListener(this);

        listaNombres = new JList();

        listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        modelo = new DefaultListModel();

        scrollLista = new JScrollPane();

        scrollLista.setBounds(20, 190 ,300, 80);

        scrollLista.setViewportView(listaNombres);

        contenedor.add(nombre);
        contenedor.add(campoNombre);
        contenedor.add(apellidos);
        contenedor.add(campoApellidos);
        contenedor.add(teléfono);
        contenedor.add(campoTeléfono);
        contenedor.add(dirección);
        contenedor.add(campoDirección);
        contenedor.add(añadir);
        contenedor.add(eliminar);
        contenedor.add(borrarLista);
        contenedor.add(scrollLista);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == añadir) {
            añadirPersona();
        }
        if (evento.getSource() == eliminar) {
            eliminarNombre(listaNombres.getSelectedIndex() );
        }

        if (evento.getSource() == borrarLista)
            borrarLista();
    }

    private void añadirPersona() {

        Persona p = new Persona(campoNombre.getText(),
                campoApellidos.getText(),
                campoTeléfono.getText(), campoDirección.getText());
        lista.añadirPersona(p);
        String elemento = campoNombre.getText() + "-" +
                campoApellidos.getText() +
"-" + campoTeléfono.getText() + "-" + campoDirección.
                getText();
        modelo.addElement(elemento);
        listaNombres.setModel(modelo);

        campoNombre.setText("");
        campoApellidos.setText("");
        campoTeléfono.setText("");
        campoDirección.setText("");
    }
    private void eliminarNombre(int indice) {
        if (indice >= 0) {
            modelo.removeElementAt(indice);
            lista.eliminarPersona(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void borrarLista() {
        lista.borrarLista();
        modelo.clear();
    }
}
