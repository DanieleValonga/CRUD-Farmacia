package com.generation.crudfarmacia.model;

import jakarta.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@Entity
@Table(name = "tb_categorias")
public class Categoria {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    @Column(name = "marca", nullable = false, length = 100)
	    private String nome;
	    @Column(name = "descricao", nullable = false, columnDefinition = "TEXT")
	    private String descricao;
	    @Column(name = "categoria", nullable = false, length = 100)
	    private String categoria;

	    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, orphanRemoval = true)
	    @JsonIgnoreProperties("categoria")
	    private List<Produto> produtos;


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
	    public String getDescricao() {
	        return descricao;
	    }
	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }
	    public String getCategoria() {
	        return categoria;
	    }
	    public void setCategoria(String categoria) {
	        this.categoria = categoria;
	    }
}
