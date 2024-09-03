package com.example.NunesSports.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDTO {

    private Long id;
    private String codigo;
    private String nome;
    private String descricao;
    private Double preco;

}
