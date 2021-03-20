import java.util.*;

public class Main {
    
    public static void main(String[] args)
    {
        
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
                MenuCatalogo();
                break;
            }

            case 2:
            {
                System.out.println("Você saiu do programa!");
                break;
            }
        }
    }

    public static void MenuCatalogo()
    {
        Scanner teclado = new Scanner(System.in);
        int escCatag = 0;

        Catalogo catalogo = new Catalogo();


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
                ViewCatalogo();
                break;
            }

            case 2:
            {
                FiltroPrec();
                break;
            }

            case 3:
            {
                FiltroTipo();
                break;
            }
            case 4:
            {
                System.out.println("Você saiu do programa!");
                break;
            }
        }

    }

    public static void ViewCatalogo()
    {
        Catalogo catalogo = new Catalogo();

        for(int i=0; i <catalogo.size();i++)
        {   
            Veiculo veiculo = catalogo.getVeiculo(i);

            System.out.println();
        }

        MenuCatalogo();
    }
    
    public static void FiltroPrec()
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


        Catalogo catalogo = new Catalogo();
        boolean ver = false;


        for(int i=0; i <catalogo.size();i++)
        {   
            Veiculo veiculo = catalogo.getVeiculo(i);

            if(preco > veiculo.getPreco())
            {
                ver = true;
                System.out.println();
            }
        }

        if(ver)
        {
            System.out.println("\n Não há veículos abaixo desse preço!");
        }

        MenuCatalogo();
    }

    public static void FiltroTipo()
    {
        Scanner teclado = new Scanner(System.in);

        String tipo = "";

        do
        {
            System.out.print("\n \n Qual o tipo utilizado de filtro: ");
                
                try {
                    tipo = teclado.nextLine();
                } catch (Exception e) {
                    System.out.println("\n O valor utilizado é inválido!");
                    teclado.next();
                }

                if(!tipo.equals("Carro") && !tipo.equals("Moto") && !tipo.equals("Caminhão"))
                {
                    System.out.println("\n Esse tipo não existe!");
                }

        }while(!tipo.equals("Carro") && !tipo.equals("Moto") && !tipo.equals("Caminhão"));


        Catalogo catalogo = new Catalogo();
        

        for(int i=0; i <catalogo.size();i++)
        {   
            Veiculo veiculo = catalogo.getVeiculo(i);

            if(tipo.equals(veiculo.getNome()))
            {
                System.out.println();
            }
        }

        MenuCatalogo();
    }
}