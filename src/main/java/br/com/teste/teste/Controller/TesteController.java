package br.com.teste.teste.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping
    public Livros cadastrarLivros(@RequestBody Livros livro){
        livros.add(livro);
        return livro;
    }

    @PutMapping
    public String alterarLivros(@RequestBody String livro){
        return livro;
    }
    
}
