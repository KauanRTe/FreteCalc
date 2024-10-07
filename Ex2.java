import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// Declaração das variáveis e scanner
		String codigo;
		int qtd, estadoDestino, tipoEmbalagem, qtdAdicionais;
		int[] adicionais = new int[3];
		double valorTotal = 0, subFrete, totalFrete, valorEmbalagem, valorAdicionais;
		Scanner scan = new Scanner(System.in);

		// Leitura das variáveis
		System.out.print("============== PRODUTO ===============\n" + "A001 - Mouse Óptico USB sem fio R$ 42,00\n"
				+ "A002 - SSD 480GB R$ 300,00\n" + "A003 - Adaptador Wireless USB 3.0 R$ 95,00\n"
				+ "A004 - Pen Drive 32GB R$ 30,00\n" + "A005 - Webcam Full HD – R$ 229,00\n"
				+ "===================================\n" + "Qual é o código do produto?\n>> ");
		codigo = scan.nextLine();
		
		//Espaçamento
		for(int i = 0; i < 2; i++) {
			System.out.println("...");
		}

		System.out.print("Qual é a quantidade do produto (Inferior a 12)?\n>> ");
		qtd = scan.nextInt();
		if(qtd > 12 | qtd <= 0) {
			System.out.println("Quantidade inválida.");
			return;
		}
		
		//Espaçamento
		for(int i = 0; i < 2; i++) {
			System.out.println("...");
		}

		System.out.print("============== ESTADO ===============\n" + "1. Rio Grande do Sul (9%);\n"
				+ "2. São Paulo (7%);\n" + "3. Brasília (11%);\n" + "4. Salvador (14%);\n" + "5. Manaus (18%);\n"
				+ "===================================\n"
				+ "Qual é o estado? (Digite apenas o número corresp. ao estado) \n>> ");
		estadoDestino = scan.nextInt();
		
		//Espaçamento
		for(int i = 0; i < 2; i++) {
			System.out.println("...");
		}

		System.out.print("============== EMBALAGEM ===============\n" + "1. Caixa de papelão grande comum R$12,00;\n"
				+ "2. Caixa de papelão grande triplex R$22,00;\n" + "3. Plástico bolha R$14,00;\n"
				+ "4. Saco plástico R$7,00;\n" + "===================================\n"
				+ "Qual é o tipo da embalagem?\n>> ");
		tipoEmbalagem = scan.nextInt();
		
		//Espaçamento
		for(int i = 0; i < 2; i++) {
			System.out.println("...");
		}

		System.out.print("============== ADICIONAIS ===============\n" + "1. Seguro(7%);\n" + "2. Rastreamento(4%);\n"
				+ "3. Escolta Armada(12%);\n" + "===================================\n"
				+ "\nQuantos adicionais você quer?\n>> ");
		qtdAdicionais = scan.nextInt();
		
		//Espaçamento
		for(int i = 0; i < 2; i++) {
			System.out.println("...");
		}

		if (qtdAdicionais == 1) {
			System.out.print("Qual adicional você quer?\n>> ");
			adicionais[0] = scan.nextInt();
		}

		else if (qtdAdicionais == 2) {
			System.out.print("Digite o primeiro adicional:\n>> ");
			adicionais[0] = scan.nextInt();
			System.out.print("Digite o segundo adicional:\n>> ");
			adicionais[1] = scan.nextInt();
		} else if (qtdAdicionais == 3) {
			System.out.print("Digite o primeiro adicional:\n>> ");
			adicionais[0] = scan.nextInt();
			System.out.print("Digite o segundo adicional:\n>> ");
			adicionais[1] = scan.nextInt();
			System.out.print("Digite o terceiro adicional:\n>> ");
			adicionais[2] = scan.nextInt();
		}

		// Fecha o scanner
		scan.close();

		// Valor total
		switch (codigo.toUpperCase()) {
		case "A001" -> {
			valorTotal = 42.00 * qtd;
			break;
		}
		case "A002" -> {
			valorTotal = 300.00 * qtd;
			break;
		}
		case "A003" -> {
			valorTotal = 95.00 * qtd;
			break;
		}
		case "A004" -> {
			valorTotal = 30.00 * qtd;
			break;
		}case "A005"->{
			valorTotal = 229.00 * qtd;
		}
		default -> {
			System.out.println("Código do produto digitado de forma incorreta!");
			return;
		}
		}

		// Subtotal do Frete
		switch (estadoDestino) {
		case 1 -> {
			subFrete = valorTotal * 0.09;
			break;
		}
		case 2 -> {
			subFrete = valorTotal * 0.07;
			break;
		}
		case 3 -> {
			subFrete = valorTotal * 0.11;
			break;
		}
		case 4 -> {
			subFrete = valorTotal * 0.14;
			break;
		}
		case 5 ->{
			subFrete = valorTotal * 0.18;
		}
		default -> {
			System.out.println("Estado foi digitado de forma incorreta.");
			return;
		}
		}

		// Valor da embalagem
		switch (tipoEmbalagem) {
		case 1 -> {
			valorEmbalagem = 12.00;
			break;
		}
		case 2 -> {
			valorEmbalagem = 22.00;
			break;
		}
		case 3 -> {
			valorEmbalagem = 14.00;
			break;
		}
		case 4 ->{
			valorEmbalagem = 7.00;
		}
		default -> {
			System.out.println("Valor da embalagem digitado de forma incorreta!");
			return;
		}
		}

		// Valor cobrado pelos adicionais
		switch (adicionais[0]) {
		case 1 -> {
			valorAdicionais = valorTotal * 0.07;
			break;
		}
		case 2 -> {
			valorAdicionais = valorTotal * 0.04;
			break;
		}
		case 3 -> {
			valorAdicionais = valorTotal * 0.12;
			break;
		}
		default -> {
			valorAdicionais = 0;
		}
		}
		switch (adicionais[1]) {
		case 1 -> {
			valorAdicionais += valorTotal * 0.07;
			break;
		}
		case 2 -> {
			valorAdicionais += valorTotal * 0.04;
			break;
		}
		case 3 -> {
			valorAdicionais += valorTotal * 0.12;
			break;
		}
		default -> {
			valorAdicionais += 0;
		}

		}
		switch (adicionais[2]) {
		case 1 -> {
			valorAdicionais += valorTotal * 0.07;
		}
		case 2 -> {
			valorAdicionais += valorTotal * 0.04;
		}
		case 3 -> {
			valorAdicionais += valorTotal * 0.12;
		}
		default -> {
			valorAdicionais += 0;
		}

		}
		
		//Valor final do frete
		totalFrete = subFrete + valorEmbalagem + valorAdicionais;
		
		
		//Exibição dos resultados
		
		System.out.printf("%nValor total do produto: %.2f%nSubtotal do Frete: %.2f%nValor da Embalagem: %.2f%nValor dos Adicionais: %.2f%nValor Final do Frete: %.2f",valorTotal,subFrete,valorEmbalagem,valorAdicionais,totalFrete);
		

	}
}
