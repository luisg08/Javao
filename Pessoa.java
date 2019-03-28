public class Pessoa{
	private String nome;
	private int idade;
	private int cpf;
	private int rg;
	private String endereco;

	public void SetNome(String n){nome = n;}
	public void SetIdade(int i){idade = i;}
	public void Setcpf(int c){cpf = c;}
	public void Setrg(int r){rg = r;}
	public void SetEndereco(String end){endereco = end;}
	
	public String getNome(){return nome;}
	public int getIdade(){return idade;}
	public int getCPF(){return cpf;}
	public int getRG(){return rg;}
	public String getEnd(){return endereco;}
}
