public class Principal{

	public static void main(String args[]){
		
		Aluno a = new Aluno();
		a.setNome("Joao");
		a.setIdade(20);
		a.setcpf("233.333.323-3");
		a.setrg("32.524.656-32");
		a.setEndereco("Rua X");
		a.setRa("13.333-37");
		a.setdataM("01/02/2018");
		
		Professor p = new Professor();
		p.setNome("Rodolfo");
		p.setIdade(35);
		p.setcpf("323.434.535-43");
		p.setrg("33.442.534-32");
		p.setEndereco("Rua Y");
		p.setTitulacao("Dr.");
		p.setAreaAtua("Seguranca");
		
		System.out.printf("Aluno %s, %d anos, %s, %s, %s, %s, %s\n",a.getNome(), a.getIdade(), a.getCPF(), a.getRG(), a.getEnd(), a.getRa(), a.getDataM());
		
		System.out.printf("Professor %s, %d anos, %s, %s, %s, %s, %s\n",p.getNome(), p.getIdade(), p.getCPF(), p.getRG(), p.getEnd(), p.getTitulacao(), p.getAreaAt());
	
	}
}
