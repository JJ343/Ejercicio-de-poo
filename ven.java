import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ven extends JFrame{
    private JPanel panel1;
    private JTextField Numero;
    private JTextField Nombre;
    private JButton visualizarButton;
    private JButton crearButton;
    private JButton eliminarButton;
    private JButton actualizarButton;
    private JLabel datos;

    public ven(){
        setContentPane(panel1);
        setSize(450,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        crearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datos.setText("");
                try {

                    // Get the name of the contact to be updated
                    // from the Command line argument
                    String newName = Nombre.getText();

                    // Get the number to be updated
                    // from the Command line argument
                    long newNumber = Long.parseLong(Numero.getText());

                    String nameNumberString;
                    String name;
                    long number;
                    int index;

                    // Using file pointer creating the file.
                    File file = new File("friendsContact.txt");

                    if (!file.exists()) {

                        // Create a new file if not exists.
                        file.createNewFile();
                    }

                    // Opening file in reading and write mode.

                    RandomAccessFile raf
                            = new RandomAccessFile(file, "rw");
                    boolean found = false;

                    // Checking whether the name
                    // of contact already exists.
                    // getFilePointer() give the current offset
                    // value from start of the file.
                    while (raf.getFilePointer() < raf.length()) {

                        // reading line from the file.
                        nameNumberString = raf.readLine();

                        // splitting the string to get name and
                        // number
                        String[] lineSplit
                                = nameNumberString.split("!");

                        // separating name and number.
                        name = lineSplit[0];
                        number = Long.parseLong(lineSplit[1]);

                        // if condition to find existence of record.
                        if (name == newName
                                || number == newNumber) {
                            found = true;
                            break;
                        }
                    }

                    if (found == false) {

                        // Enter the if block when a record
                        // is not already present in the file.
                        nameNumberString
                                = newName + "!"
                                + String.valueOf(newNumber);

                        // writeBytes function to write a string
                        // as a sequence of bytes.
                        raf.writeBytes(nameNumberString);

                        // To insert the next record in new line.
                        raf.writeBytes(System.lineSeparator());

                        // Print the message
                        System.out.println(" Friend added. ");

                        // Closing the resources.
                        raf.close();
                    }
                    // The contact to be updated
                    // could not be found
                    else {

                        // Closing the resources.
                        raf.close();

                        // Print the message
                        System.out.println(" Input name"
                                + " does not exists. ");
                    }
                }

                catch (IOException ioe) {

                    System.out.println(ioe);
                }
                catch (NumberFormatException nef) {

                    datos.setText("Por favor introduzca correctamente los datos");
                }


            }
        });
        visualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datos.setText("");
                try {
                    String newName = Nombre.getText();
                    String nameNumberString;
                    String name;
                    long number;
                    int index;

                    // Using file pointer creating the file.
                    File file = new File("friendsContact.txt");

                    if (!file.exists()) {

                        // Create a new file if not exists.
                        file.createNewFile();
                    }else {
                        System.out.println("El txt ya existe");
                    }

                    // Opening file in reading and write mode.

                    RandomAccessFile raf
                            = new RandomAccessFile(file, "rw");
                    boolean found = false;

                    // Traversing the file
                    // getFilePointer() give the current offset
                    // value from start of the file.
                    while (raf.getFilePointer() < raf.length()) {

                        // reading line from the file.
                        nameNumberString = raf.readLine();

                        // splitting the string to get name and
                        // number
                        String[] lineSplit
                                = nameNumberString.split("!");

                        // separating name and number.
                        name = lineSplit[0];
                        number = Long.parseLong(lineSplit[1]);

                       if (name.equals(newName)){
                        Nombre.setText(String.valueOf(name));
                        Numero.setText(String.valueOf(number));

                       }
                    }
                }
                catch (IOException ioe)
                {

                    System.out.println(ioe);
                }
                catch (NumberFormatException nef)
                {

                    datos.setText("Por favor introduzca correctamente los datos");
                }

            }
        });
        eliminarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datos.setText("");
                try {

                    // Get the name of the contact to be updated
                    // from the Command line argument
                    String newName = Nombre.getText();

                    String nameNumberString;
                    String name;
                    long number;
                    int index;

                    // Using file pointer creating the file.
                    File file = new File("friendsContact.txt");

                    if (!file.exists()) {

                        // Create a new file if not exists.
                        file.createNewFile();
                    }else {
                        System.out.println("Ya existe el txt");
                    }

                    // Opening file in reading and write mode.
                    RandomAccessFile raf
                            = new RandomAccessFile(file, "rw");
                    boolean found = false;

                    // Checking whether the name of contact exists.
                    // getFilePointer() give the current offset
                    // value from start of the file.
                    while (raf.getFilePointer() < raf.length()) {

                        // reading line from the file.
                        nameNumberString = raf.readLine();

                        // splitting the string to get name and
                        // number
                        String[] lineSplit
                                = nameNumberString.split("!");

                        // separating name and number.
                        name = lineSplit[0];
                        number = Long.parseLong(lineSplit[1]);

                        // if condition to find existence of record.
                        if (name.equals(newName) ) {
                            found = true;
                            break;
                        }
                    }

                    // Delete the contact if record exists.
                    if (found == true) {

                        // Creating a temporary file
                        // with file pointer as tmpFile.
                        File tmpFile = new File("temp.txt");

                        // Opening this temporary file
                        // in ReadWrite Mode
                        RandomAccessFile tmpraf
                                = new RandomAccessFile(tmpFile, "rw");

                        // Set file pointer to start
                        raf.seek(0);

                        // Traversing the friendsContact.txt file
                        while (raf.getFilePointer()
                                < raf.length()) {

                            // Reading the contact from the file
                            nameNumberString = raf.readLine();

                            index = nameNumberString.indexOf('!');
                            name = nameNumberString.substring(
                                    0, index);

                            // Check if the fetched contact
                            // is the one to be deleted
                            if (name.equals(newName)) {

                                // Skip inserting this contact
                                // into the temporary file
                                continue;
                            }

                            // Add this contact in the temporary
                            // file
                            tmpraf.writeBytes(nameNumberString);

                            // Add the line separator in the
                            // temporary file
                            tmpraf.writeBytes(
                                    System.lineSeparator());
                        }

                        // The contact has been deleted now
                        // So copy the updated content from
                        // the temporary file to original file.

                        // Set both files pointers to start
                        raf.seek(0);
                        tmpraf.seek(0);

                        // Copy the contents from
                        // the temporary file to original file.
                        while (tmpraf.getFilePointer()
                                < tmpraf.length()) {
                            raf.writeBytes(tmpraf.readLine());
                            raf.writeBytes(System.lineSeparator());
                        }

                        // Set the length of the original file
                        // to that of temporary.
                        raf.setLength(tmpraf.length());

                        // Closing the resources.
                        tmpraf.close();
                        raf.close();

                        // Deleting the temporary file
                        tmpFile.delete();

                        System.out.println(" Amigo eliminado ");
                    }

                    // The contact to be deleted
                    // could not be found
                    else {

                        // Closing the resources.
                        raf.close();

                        // Print the message
                        System.out.println( newName
                                + " no existe ");
                    }
                }

                catch (IOException ioe) {
                    System.out.println(ioe);
                }

            }
        });
        actualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datos.setText("");
                try {

                    // Get the name of the contact to be updated
                    // from the Command line argument
                    String newName = Nombre.getText();

                    // Get the number to be updated
                    // from the Command line argument
                    long newNumber = Long.parseLong(Numero.getText());

                    String nameNumberString;
                    String name;
                    long number;
                    int index;

                    // Using file pointer creating the file.
                    File file = new File("friendsContact.txt");

                    if (!file.exists()) {

                        // Create a new file if not exists.
                        file.createNewFile();
                    }

                    // Opening file in reading and write mode.
                    RandomAccessFile raf
                            = new RandomAccessFile(file, "rw");
                    boolean found = false;

                    // Checking whether the name
                    // of contact already exists.
                    // getFilePointer() give the current offset
                    // value from start of the file.
                    while (raf.getFilePointer() < raf.length()) {

                        // reading line from the file.
                        nameNumberString = raf.readLine();

                        // splitting the string to get name and
                        // number
                        String[] lineSplit
                                = nameNumberString.split("!");

                        // separating name and number.
                        name = lineSplit[0];
                        number = Long.parseLong(lineSplit[1]);

                        // if condition to find existence of record.
                        if (name.equals(newName)
                                || number == newNumber) {
                            found = true;
                            break;
                        }
                    }

                    // Update the contact if record exists.
                    if (found == true) {

                        // Creating a temporary file
                        // with file pointer as tmpFile.
                        File tmpFile = new File("temp.txt");

                        // Opening this temporary file
                        // in ReadWrite Mode
                        RandomAccessFile tmpraf
                                = new RandomAccessFile(tmpFile, "rw");

                        // Set file pointer to start
                        raf.seek(0);

                        // Traversing the friendsContact.txt file
                        while (raf.getFilePointer()
                                < raf.length()) {

                            // Reading the contact from the file
                            nameNumberString = raf.readLine();

                            index = nameNumberString.indexOf('!');
                            name = nameNumberString.substring(
                                    0, index);

                            // Check if the fetched contact
                            // is the one to be updated
                            if (name.equals(newName)) {

                                // Update the number of this contact
                                nameNumberString
                                        = name + "!"
                                        + String.valueOf(newNumber);
                            }

                            // Add this contact in the temporary
                            // file
                            tmpraf.writeBytes(nameNumberString);

                            // Add the line separator in the
                            // temporary file
                            tmpraf.writeBytes(
                                    System.lineSeparator());
                        }

                        // The contact has been updated now
                        // So copy the updated content from
                        // the temporary file to original file.

                        // Set both files pointers to start
                        raf.seek(0);
                        tmpraf.seek(0);

                        // Copy the contents from
                        // the temporary file to original file.
                        while (tmpraf.getFilePointer()
                                < tmpraf.length()) {
                            raf.writeBytes(tmpraf.readLine());
                            raf.writeBytes(System.lineSeparator());
                        }

                        // Set the length of the original file
                        // to that of temporary.
                        raf.setLength(tmpraf.length());

                        // Closing the resources.
                        tmpraf.close();
                        raf.close();

                        // Deleting the temporary file
                        tmpFile.delete();

                        System.out.println(" contact eliminado ");
                    }

                    // The contact to be updated
                    // could not be found
                    else {

                        // Closing the resources.
                        raf.close();

                        // Print the message
                        System.out.println( newName
                                + " no existe ");
                    }
                }

                catch (IOException ioe) {
                    System.out.println(ioe);
                }

                catch (NumberFormatException nef) {
                    datos.setText("Por favor introduzca correctamente los datos");
                }

            }
        });
    }
}
