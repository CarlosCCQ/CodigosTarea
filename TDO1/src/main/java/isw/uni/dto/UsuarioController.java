
package isw.uni.dto;

public class UsuarioController {
    
    private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public UsuarioDTO obtenerUsuarioDTO(int id) {
        Usuario usuario = usuarioService.obtenerUsuarioPorId(id);
        return UsuarioMapper.convertirAUsuarioDTO(usuario);
    }

    public static void main(String[] args) {
        
        UsuarioService usuarioService = new UsuarioService();
        UsuarioController usuarioController = new UsuarioController(usuarioService);

        int usuarioId = 1;
        UsuarioDTO usuarioDTO = usuarioController.obtenerUsuarioDTO(usuarioId);

        System.out.println("Nombre: " + usuarioDTO.getNombre());
        System.out.println("Correo: " + usuarioDTO.getCorreo());
    }
}

