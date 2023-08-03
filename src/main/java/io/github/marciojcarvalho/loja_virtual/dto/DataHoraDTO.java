package io.github.marciojcarvalho.loja_virtual.dto;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataHoraDTO {
    LocalDateTime dataCriacao;
    LocalDateTime dataAlteracao;
}
