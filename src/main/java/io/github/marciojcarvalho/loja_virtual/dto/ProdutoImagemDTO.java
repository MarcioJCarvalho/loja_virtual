package io.github.marciojcarvalho.loja_virtual.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoImagemDTO extends DataHoraDTO {
    Long id;
    String url;
    ProdutoDTO produto;
}
