package br.com.livrobackend.productapi.dto;

import br.com.livrobackend.productapi.model.Category;

import javax.validation.constraints.NotNull;

public class CategoryDTO {

    @NotNull
    private Long id;
    private String nome;

    //Getters e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Metodo
    public static CategoryDTO convert(Category category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setId(category.getId());
        categoryDTO.setNome(category.getNome());
        return categoryDTO;
    }
}
