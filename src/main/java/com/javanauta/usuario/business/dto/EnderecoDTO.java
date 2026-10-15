package com.javanauta.usuario.business.dto;

import jakarta.persistence.Column;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EnderecoDTO {

    private Long id;
    private String rua;
    private Long numero;
    private String complemento;
    private String cidade;
    private String estado;
    private String cep;
}
