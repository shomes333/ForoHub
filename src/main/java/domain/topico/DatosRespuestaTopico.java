package domain.topico;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        String estatus,
        Long autor,
        String curso ) {
}
