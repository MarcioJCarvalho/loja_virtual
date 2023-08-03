package io.github.marciojcarvalho.loja_virtual.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class DataHora {
    LocalDateTime dataCriacao;
    LocalDateTime dataAlteracao;
}
