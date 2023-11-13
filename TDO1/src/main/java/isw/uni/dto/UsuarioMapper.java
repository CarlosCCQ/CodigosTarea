
package isw.uni.dto;

public class UsuarioMapper {

    public static UsuarioDTO convertirAUsuarioDTO(Usuario usuario) {
        UsuarioDTO dto1 = new UsuarioDTO();
        dto1.setNombre(usuario.getNombre());
        dto1.setCorreo(usuario.getCorreo());
        return dto1;
    }
}

