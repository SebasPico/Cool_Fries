package Usuarios;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private String contrasena;
    private String tipo;

    public Usuario(String nombre, String contrasena, String tipo) {
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.tipo = tipo;
    }

    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Carga de usuarios desde archivo XML

    public static List<Usuario> cargarUsuariosDesdeXML(String archivoXML) {
        List<Usuario> usuarios = new ArrayList<>();

        try {
            File archivo = new File(archivoXML);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(archivo);

            NodeList listaUsuarios = doc.getElementsByTagName("usuario");

            for (int i = 0; i < listaUsuarios.getLength(); i++) {
                Element elementoUsuario = (Element) listaUsuarios.item(i);
                String nombre = elementoUsuario.getElementsByTagName("nombre").item(0).getTextContent();
                String contrasena = elementoUsuario.getElementsByTagName("contrasena").item(0).getTextContent();
                String tipo = elementoUsuario.getElementsByTagName("tipo").item(0).getTextContent();
                Usuario usuario = new Usuario(nombre, contrasena, tipo);
                usuarios.add(usuario);
            }
        } catch (IOException | ParserConfigurationException | SAXException e) {
            e.printStackTrace();
        }

        return usuarios;
    }

    // Búsqueda de usuario por nombre y contraseña

    public static Usuario buscarUsuarioPorNombreYPassword(String nombre, String contrasena, List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNombre().equals(nombre) && usuario.getContrasena().equals(contrasena)) {
                return usuario;
            }
        }

        return null;
    }
}
