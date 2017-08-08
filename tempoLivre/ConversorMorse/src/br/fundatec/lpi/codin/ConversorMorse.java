package br.fundatec.lpi.codin;

public class ConversorMorse {

	private String mensagem;

	public ConversorMorse(String mensagem) {
		this.mensagem = mensagem;
		converterMensagem();
	}
//char letter = 'mensagem'.charAt(loop);
	private void converterMensagem() {
		String mensagemConvertida = "";
		for(int loop = 0; loop <= mensagem.length(); loop++){
			switch (mensagem.charAt(loop)) {
			case "A":
				
				break;

			default:
				break;
			}
		}
	}
	
}
