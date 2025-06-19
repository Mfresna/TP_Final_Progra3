package TpFinal_Progra3.services.interfaces;

import TpFinal_Progra3.model.DTO.filtros.UsuarioFiltroDTO;
import TpFinal_Progra3.model.DTO.usuarios.UsuarioBasicoDTO;
import TpFinal_Progra3.model.DTO.usuarios.UsuarioDTO;
import TpFinal_Progra3.model.DTO.usuarios.UsuarioResponseDTO;
import TpFinal_Progra3.model.entities.Usuario;
import TpFinal_Progra3.security.model.DTO.PasswordDTO;
import TpFinal_Progra3.security.model.DTO.RolesDTO;
import jakarta.servlet.http.HttpServletRequest;

import java.util.List;

public interface UsuarioServiceInterface {
    UsuarioResponseDTO registrarUsuario(UsuarioDTO dto);
    Usuario buscarUsuario(Long id);
    Usuario buscarUsuario(String email);
    UsuarioResponseDTO obtenerUsuario(Long id);
    List<UsuarioResponseDTO> filtrarUsuarios(UsuarioFiltroDTO filtro);
    UsuarioResponseDTO modificarUsuario(HttpServletRequest request, Long id, UsuarioBasicoDTO usrDto);
    UsuarioResponseDTO actualizarImagenPerfil(HttpServletRequest request, String url);
    String inhabilitarCuenta(Long id, HttpServletRequest request);
    String habilitarCuenta(Long id, HttpServletRequest request);
    UsuarioResponseDTO obtenerMiPerfil(HttpServletRequest request);
    UsuarioResponseDTO agregarRoles(HttpServletRequest request, Long id, RolesDTO rolesDTO);
    UsuarioResponseDTO quitarRoles(HttpServletRequest request, Long id, RolesDTO rolesDTO);
    String cambiarPassword(Usuario usr, PasswordDTO passwordDTO);
}
