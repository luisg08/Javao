public class Professor extends Pessoa{
	
	private String areaAtuacao;
	private String titulacao;

	public void setAreaAtua(String AreaAt){ areaAtuacao = AreaAt; }
	public void setTitulacao(String titu){ titulacao = titu; }
		
	
	public String getAreaAt(){return areaAtuacao;}
	public String getTitulacao(){return titulacao;}
}
