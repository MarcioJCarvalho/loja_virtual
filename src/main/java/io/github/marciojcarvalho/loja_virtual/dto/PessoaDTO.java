package io.github.marciojcarvalho.loja_virtual.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO extends DataHoraDTO {
    Long id;
    String nome;
    String cpf;
    String email;
    String senha;
    String endereco;
    String cep;
    CidadeDTO cidade;

}
