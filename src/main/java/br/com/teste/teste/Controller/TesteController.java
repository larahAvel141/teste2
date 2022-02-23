package br.com.teste.teste.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.teste.Model.Livros;

@RestController
@RequestMapping("/teste/livros")
public class TesteController {

    public List<Livros> livros = new ArrayList<>();

    @GetMapping
    public List<Livros> getLivros(){
        return livros;
    }

    @GetMapping(value = "/{nome}")
    public String requisicao(@PathVariable String nome){
        return String.format("Olá %s, tudo bem? ;) !!",nome);
    }

    @PostMapping
    public Livros cadastrarLivros(@RequestBody Livros livro){
        livros.add(livro);
        return livro;
    }

    @PutMapping
    public Livros alterarLivros(@RequestBody Livros livro){
        livro.setTitulo(livro.getTitulo()+"modificado com sucesso");
        return livro;
    }
    
}
