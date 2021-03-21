import java.util.*;

public class Main {
    
    public static void main(String[] args)
    {
        Catalogo catalogo = new Catalogo();

        IntanciarVei(catalogo);
        
        Scanner teclado = new Scanner(System.in);

        int escMenu = 0;
        

        do
        {
            escMenu = 0;

            System.out.println("+------------------------------------------------+");
            System.out.println("|               Bem-Vindo a loja ****            |");
            System.out.println("|                                                |");
            System.out.println("|   1- Ver o catálogo                            |");
            System.out.println("|   2- Sair do programa                          |");
            System.out.println("|                                                |");
            System.out.println("+------------------------------------------------+");

            do
            {
                System.out.print("\n \n Escolha uma opção: ");
                
                try {
                    escMenu = teclado.nextInt();
                } catch (Exception e) {
                    System.out.println("\n O valor utilizado é inválido!");
                    teclado.next();
                }

                if(escMenu!=1 && escMenu!=2)
                {
                    System.out.println("\n O Valor deve ser entre 1 e 2!");
                }

            }while(escMenu!=1 && escMenu!=2);


        }while(escMenu!=1 && escMenu!=2);

        switch(escMenu)
        {
            case 1:
            {
                MenuCatalogo(catalogo);
                break;
            }

            case 2:
            {
                System.out.println("Você saiu do programa!");
                break;
            }
        }
    }

    public static void MenuCatalogo(Catalogo catalogo)
    {
        Scanner teclado = new Scanner(System.in);
        int escCatag = 0;


        do
        {
           
            System.out.println("\n+------------------------------------------------+");
            System.out.println("|   Como você deseja vizualizar o catálogo:      |");
            System.out.println("|                                                |");
            System.out.println("|   1- Vizualizar todo o catálo                  |");
            System.out.println("|   2- Aplicar filtro por preço                  |");
            System.out.println("|   3- Aplicar filtro por tipo                   |");
            System.out.println("|   4- Sair do programa                          |");
            System.out.println("+------------------------------------------------+");

            do
            {
                System.out.print("\n \n Escolha uma opção: ");
                
                try {
                    escCatag = teclado.nextInt();
                } catch (Exception e) {
                    System.out.println("\n O valor utilizado é inválido!");
                    teclado.next();
                }

                if(escCatag!=1 && escCatag!=2 && escCatag!=3 && escCatag!=4)
                {
                    System.out.println("\n O Valor deve ser entre 1 e 2!");
                }

            }while(escCatag!=1 && escCatag!=2 && escCatag!=3 && escCatag!=4);

        }while(escCatag!=1 && escCatag!=2 && escCatag!=3 && escCatag!=4);

        switch(escCatag)
        {
            case 1:
            {
                ViewCatalogo(catalogo);
                break;
            }

            case 2:
            {
                FiltroPrec(catalogo);
                break;
            }

            case 3:
            {
                FiltroTipo(catalogo);
                break;
            }
            case 4:
            {
                System.out.println("Você saiu do programa!");
                break;
            }
        }

    }

    public static void ViewCatalogo(Catalogo catalogo)
    {
        

        for(int i=0; i <catalogo.size();i++)
        {   
            Veiculo veiculo = catalogo.getVeiculo(i);

            if(veiculo.getTipo().equals("Carro"))
            {
                System.out.println();// Digitar os valores da sai aqui
            }

            else if(veiculo.getTipo().equals("Moto"))
            {
                System.out.println();// Digitar os valores da sai aqui
            }

            else if(veiculo.getTipo().equals("Caminhão"))
            {
                System.out.println();// Digitar os valores da sai aqui
            }
        }

        MenuCatalogo(catalogo);
    }
    
    public static void FiltroPrec(Catalogo catalogo)
    {
        Scanner teclado = new Scanner(System.in);

        double preco = 0;

        do
        {
            System.out.print("\n \n Qual o preço de filtro: ");
                
                try {
                    preco = teclado.nextDouble();
                } catch (Exception e) {
                    System.out.println("\n O valor utilizado é inválido!");
                    teclado.next();
                }

                if(preco<0)
                {
                    System.out.println("\n O Valor deve ser maior que 0!");
                }

        }while(preco<=0);



        boolean ver = true;


        for(int i=0; i <catalogo.size();i++)
        {   
            Veiculo veiculo = catalogo.getVeiculo(i);

            if(preco >= veiculo.getPreco())
            {
                ver = false;

                if(veiculo.getTipo().equals("Carro"))
                {
                    System.out.println();// Digitar os valores da sai aqui
                }

                else if(veiculo.getTipo().equals("Moto"))
                {
                    System.out.println();// Digitar os valores da sai aqui
                }

                else if(veiculo.getTipo().equals("Caminhão"))
                {
                    System.out.println();// Digitar os valores da sai aqui
                }
            
            }
        }

        if(ver)
        {
            System.out.println("\n Não há veículos abaixo desse preço!");
        }

        MenuCatalogo(catalogo);
    }

    public static void FiltroTipo(Catalogo catalogo)
    {
        Scanner teclado = new Scanner(System.in);

        int escTipo = 0;
        String tipo = "";

        do
        {
           
            System.out.println("\n+------------------------------------------------+");
            System.out.println("|               Qual tipo deseja?                |");
            System.out.println("|                                                |");
            System.out.println("|   1- Carro                                     |");
            System.out.println("|   2- Moto                                      |");
            System.out.println("|   3- Caminhão                                  |");
            System.out.println("+------------------------------------------------+");

            do
            {
                System.out.print("\n \n Escolha uma opção: ");
                
                try {
                    escTipo = teclado.nextInt();
                } catch (Exception e) {
                    System.out.println("\n O valor utilizado é inválido!");
                    teclado.next();
                }

                if(escTipo!=1 && escTipo!=2 && escTipo!=3)
                {
                    System.out.println("\n O Valor deve ser entre 1, 2 e 3!");
                }

            }while(escTipo!=1 && escTipo!=2 && escTipo!=3);

        }while(escTipo!=1 && escTipo!=2 && escTipo!=3);

        switch(escTipo)
        {
            case 1:
            {
                tipo = "Carro";
                break;
            }

            case 2:
            {
                tipo = "Moto";
                break;
            }

            case 3:
            {
                tipo = "Caminhão";
                break;
            }
            
        }


        boolean ver = true;

        for(int i=0; i <catalogo.size();i++)
        {   
            Veiculo veiculo = catalogo.getVeiculo(i);

            if(tipo.equals(veiculo.getTipo()))
            {
                ver = false;

                if(veiculo.getTipo().equals("Carro"))
                {
                    System.out.println();// Digitar os valores da sai aqui
                }

                else if(veiculo.getTipo().equals("Moto"))
                {
                    System.out.println();// Digitar os valores da sai aqui
                }

                else if(veiculo.getTipo().equals("Caminhão"))
                {
                    System.out.println();// Digitar os valores da sai aqui
                }
            }

        }

        if(ver)
        {
            System.out.println("Não há carros desse tipo!");
        }

        MenuCatalogo(catalogo);
    }

    public static void IntanciarVei(Catalogo catalogo)
    {
        Carro carro = new Carro("Volk", "Carro", "B", "Al 5", "Preto", 140000, 4, 1150000, 5, 100);
        Carro carro1 = new Carro("Fion", "Carro", "B", "V45", "Amarelo", 100000, 4, 1400000, 5, 120);
        Carro carro2 = new Carro("Blou", "Carro", "B", "3500", "Amarelo", 40000, 4, 1900000, 5, 130);
        Carro carro3 = new Carro("Destiny", "Carro", "B", "Op0", "Preto", 70000, 4, 1150000, 5, 180);
        Carro carro4 = new Carro("Dayou", "Carro", "B", "Kiso", "Verde", 160000, 4, 1600000, 5, 110);
        Carro carro5 = new Carro("Drist", "Carro", "B", "USV 67", "Azul", 90000, 4, 2000000, 5, 140);
        Carro carro6 = new Carro("Vanomi", "Carro", "B", "Lo 02", "Preto", 960000, 4, 900000, 5, 100);
        Carro carro7 = new Carro("Point", "Carro", "B", "Fi 456", "Verde", 130000, 4, 1100000, 5, 110);
        Carro carro8 = new Carro("Darto", "Carro", "B", "Cars 10", "Cinza", 125000, 4, 1200000, 5, 160);
 
        catalogo.addVeiculo(carro);
        catalogo.addVeiculo(carro1);
        catalogo.addVeiculo(carro2);
        catalogo.addVeiculo(carro3);
        catalogo.addVeiculo(carro4);
        catalogo.addVeiculo(carro5);
        catalogo.addVeiculo(carro6);
        catalogo.addVeiculo(carro7);
        catalogo.addVeiculo(carro8);

        Moto moto = new Moto("Lino", "Moto", "A", "V3", "Vermelho", 50000, 0, 300, 2);
        Moto moto1 = new Moto("Nivo", "Moto", "A", "Loe", "Azul", 70000, 0, 350, 2);
        Moto moto2 = new Moto("Dartino", "Moto", "A", "V3", "Verde", 55000, 0, 210, 2);
        Moto moto3 = new Moto("Calu", "Moto", "A", "V2", "Verde", 90000, 0, 400, 2);
        Moto moto4 = new Moto("Pinh", "Moto", "A", "Pok", "Amarelo", 62000, 0, 360, 2);
        Moto moto5 = new Moto("G43", "Moto", "A", "V6", "Verde", 35000, 0, 210, 2);
        Moto moto6 = new Moto("G32", "Moto", "A", "Loe v2", "Vermelho", 67000, 0, 500, 2);
        Moto moto7 = new Moto("Lop", "Moto", "A", "Loe v3", "Cinza", 47000, 0, 250, 2);
        Moto moto8 = new Moto("Dart", "Moto", "A", "A7", "Azul", 30000, 0, 280, 2);

        catalogo.addVeiculo(moto);
        catalogo.addVeiculo(moto1);
        catalogo.addVeiculo(moto2);
        catalogo.addVeiculo(moto3);
        catalogo.addVeiculo(moto4);
        catalogo.addVeiculo(moto5);
        catalogo.addVeiculo(moto6);
        catalogo.addVeiculo(moto7);
        catalogo.addVeiculo(moto8);

        Caminhao caminhao = new Caminhao("Lioa", "Caminhão", "D", "Gio 3", "Azul", 150000, 2, 3, 16000000, 2000000);
        Caminhao caminhao1 = new Caminhao("Daoi", "Caminhão", "D", "Carf 3", "Amarelo", 170000, 2, 3, 22000000, 2400000);
        Caminhao caminhao2 = new Caminhao("Lou", "Caminhão", "D", "Kom", "Preto", 200000, 2, 3, 13000000, 2300000);
        Caminhao caminhao3 = new Caminhao("Carp", "Caminhão", "D", "Fast 4", "Verde", 130000, 2, 3, 28000000, 3400000);
        Caminhao caminhao4 = new Caminhao("Karto", "Caminhão", "D", "Joi 67", "Cinza", 180000, 2, 3, 20000000, 3500000);
        Caminhao caminhao5 = new Caminhao("Scd23", "Caminhão", "D", "Turbo", "Vermelho", 190000, 2, 3, 24000000, 2100000);
        Caminhao caminhao6 = new Caminhao("Pno 10", "Caminhão", "D", "V2", "Azul", 100000, 2, 3, 16000000, 2300000);
        Caminhao caminhao7 = new Caminhao("Ac 34", "Caminhão", "D", "V5", "Amarelo", 210000, 2, 3, 26000000, 2700000);
        Caminhao caminhao8 = new Caminhao("Voiu 90", "Caminhão", "D", "V8", "Preto", 300000, 2, 3, 20000000, 1800000);
    
        catalogo.addVeiculo(caminhao);
        catalogo.addVeiculo(caminhao1);
        catalogo.addVeiculo(caminhao2);
        catalogo.addVeiculo(caminhao3);
        catalogo.addVeiculo(caminhao4);
        catalogo.addVeiculo(caminhao5);
        catalogo.addVeiculo(caminhao6);
        catalogo.addVeiculo(caminhao7);
        catalogo.addVeiculo(caminhao8);
    }
        
}