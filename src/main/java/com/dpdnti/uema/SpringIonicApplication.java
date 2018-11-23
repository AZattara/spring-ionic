package com.dpdnti.uema;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dpdnti.uema.domain.Categoria;
import com.dpdnti.uema.domain.Cidade;
import com.dpdnti.uema.domain.Cliente;
import com.dpdnti.uema.domain.Endereco;
import com.dpdnti.uema.domain.Estado;
import com.dpdnti.uema.domain.Produto;
import com.dpdnti.uema.domain.enums.TipoCliente;
import com.dpdnti.uema.repositories.CategoriaRepository;
import com.dpdnti.uema.repositories.CidadeRepository;
import com.dpdnti.uema.repositories.ClienteRepository;
import com.dpdnti.uema.repositories.EnderecoRepository;
import com.dpdnti.uema.repositories.EstadoRepository;
import com.dpdnti.uema.repositories.ProdutoRepository;

@SpringBootApplication
public class SpringIonicApplication implements CommandLineRunner{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringIonicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		Cidade c3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2, c3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "35874198526", TipoCliente.PESSOAFISICA);
		
		cli1.getTelefones().addAll(Arrays.asList("9587487596", "9898521634"));
		
		Endereco e1 = new Endereco(null, "Rua Flores", "521", "Apto 521", "Cidade Operaria", "65058212", cli1, c1);
		Endereco e2 = new Endereco(null, "Avenida Mattos", "1417", "Sala 800", "Anil" , "65058205", cli1, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
	}
}
