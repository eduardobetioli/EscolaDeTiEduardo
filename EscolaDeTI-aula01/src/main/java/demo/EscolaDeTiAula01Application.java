package demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/teste")
public class EscolaDeTiAula01Application{
	@RequestMapping(value="/ola", method=RequestMethod.GET)
	public String digaOla(){
		return "Olá Mundo!";
	}
	@RequestMapping(value="/alunos/{ra}", method=RequestMethod.GET)
	public Aluno getAluno(@PathVariable Integer ra) {
		Aluno novo = new Aluno("Eduardo Betioli " + System.currentTimeMillis(), ra);
		return novo;
	}
	@RequestMapping(value="/alunos", method=RequestMethod.POST)
	public String criarAluno(@RequestBody(required=true) Aluno novo) {
		return "Aluno de nome [" + novo.getNome() + "] recebido com sucesso";
	}
}