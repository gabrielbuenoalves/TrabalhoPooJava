# TrabalhoPooJava
 
=>CRUD de cliente
id
nome
endereço
CPF
telefone
login
senha
tipoUsuario
dataCriacao
dataModificacao

Cliente e conta tem uma relação de 1 para 1 (1 x 1). O usuário pode ser comum ou administrador. Deixe uma administrador pré-cadastrado no programa.

=>CRUD de conta corrente
id
cliente
saldo
dataCriacao 
dataModificacao

=>Operações na conta corrente:
depósito
saque
saldo
pagamento
transferência
extrato(O extrato não mostra os valores em ativos alocados)

Será necessário fazer um CRUD de movimentação de conta. Isso ajuda gerar o extrato. Informações importantes: id, conta*, tipo movimento (crédito, débito), descrição, valor, data criação e data modificação.


=>O custo de manutenção será de R$20,00 e será debitado todo dia 15.

=>CRUD de ativo
id
nome da empresa
ticker
total de ativos (cotas/acoes/...)
preço inicial
data criação
data modificação

=>CRUD de Ordem
quantidade que deseja (comprar/vender)
valor que deseja (comprar/vender)
valor total da ordem
Só é possível efetuar uma operação de compra se você tem saldo disponível
id
conta
tipo da ordem (compra, venda, ordem 0)
ticker
quantidade
valor
valor total
estado (parcial, total, não)
data criação
data modificação

Uma ordem tem um valor fixo 10 reais para o comprador e para o vendedor
O valor é transferido para a bolsa

=>Book de Ofertas. O book mostra todas as ordens de compra e de venda para um dado ativo. 
No exemplo, uma pessoa está vendendo uma unidade por 94,30 e outra pessoa está comprando por 94,88. 
Neste caso não há negociação.
A última venda foi executada por 94,9. 
Este o preço atual do ativo. 
Se você efetuar uma ordem com um valor maior que o valor de venda, a sua ordem é automaticamente executada pelo valor de venda. 
Se você quer comprar 100 unidades, mas apenas 50 estão disponíveis, você pode ter uma ordem parcialmente executada. 
Uma ativo pode ser comprado a partir de diversos vendedores.

=>CRUD de Ordem Execução.
id
ordem
conta 
compra
conta venda*
quantidade
data criação
data modificação

=>Ultima negociação.
id
ticker
conta compra*
conta venda*
quantidade
valor
valor total
data criação
data modificação

=>TELA meus ativos. Nesta tela será possível visualizar a sua posição em ativos. 
O ativo que te pertence, a quantidade que pertence, valor atual dos ativos e  cotação atual. 
Além disso, o total de dinheiro em ativos e o lucro ou prejuízo atual em cima dos ativos.

=>Estado de um ativo. A partir da tela MEUS ATIVOS é possível visualizar mais informações de um dado ativo. 
A quantidade que você tem, qual o total foi gasto nesta compra, qual o valor atual dos ativos, qual o seu lucro e prejuízo e qual a porcentagem.

