package br.com.developeracademy;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/alunos")
public class AlunoResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Aluno aluno = new Aluno();
        aluno.setId(1L);
        aluno.setNome("Fabrício Leonard");
        aluno.setIdade(100);
        aluno.setAltura(1.70);
        aluno.setAtivo(true);
        return aluno.toString();
    }
}
