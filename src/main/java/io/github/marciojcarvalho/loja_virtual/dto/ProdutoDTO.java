package io.github.marciojcarvalho.loja_virtual.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO extends DataHoraDTO {
    Long id;
    String descricaoCurta;
    String descricaoDetalhada;
    Double valorCusto;
    Double valorVenda;
    MarcaDTO marca;
    CategoriaDTO categoria;
}
