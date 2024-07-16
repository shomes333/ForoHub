package com.example.ForoHub.security;

import domain.usuario.UsuarioRepository ;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class SecurityFilter extends OncePerRequestFilter {

    @Autowired
    private TokenService tokenService;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //System.out.println("El filtro esta funcionando");
        // Obtener el Token del Header
        var authHeader = request.getHeader("Authorization");

        if (authHeader != null) {
            System.out.println("El token no es null");
            var token = authHeader.replace("Bearer ", "");
            var nombreUsuario = tokenService.getSubject(token); // extract username, y a subject es igual a nombreUsuario

            if (nombreUsuario != null) {
                System.out.println("hasta aqui");
                // Token valido
                var usuario = usuarioRepository.findByLogin(nombreUsuario);
                // Forzamos la autenticaion de usuario
                var authentication = new UsernamePasswordAuthenticationToken(usuario, null, usuario.getAuthorities()); // Forzamos el inicio de sesion
                SecurityContextHolder.getContext().setAuthentication(authentication);
            }
        }
        filterChain.doFilter(request, response);

    }

}
