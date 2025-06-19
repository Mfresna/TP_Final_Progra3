package TpFinal_Progra3.model.DTO.filtros;

import TpFinal_Progra3.model.enums.CategoriaObra;
import TpFinal_Progra3.model.enums.EstadoObra;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
@Schema(description = "DTO utilizado para aplicar filtros en la búsqueda de obras.")
public class ObraFiltroDTO {
    @Schema(
            description = "Categoría de la obra.",
            example = "VIVIENDA"
    )
    private CategoriaObra categoria;

    @Schema(
            description = "Estado actual de la obra.",
            example = "FINALIZADA"
    )
    private EstadoObra estado;

    @Schema(
            description = "ID del estudio de arquitectura responsable de la obra.",
            example = "3"
    )
    @Positive(message = "El ID del estudio debe ser un número positivo.")
    private Long estudioId;
}
