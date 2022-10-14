# Tecnologia e IDE
- NetBeans 8.2
- Java 8

# Frames de exibição
## Class - JFrame
> Cria a janela do programa

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
title | título da janela
resizable | define se o usuário pode ou não alterar o tamanho da janela
 

## Class - JMenuBar
> Cria uma barra de menu e podem gerar "filhos" JMenu 

**JMenu** são componentes de menu que herdam de JMenuBar utilizados para compor o JMenuBar e podem gerar "filhos" JMenuItem 

**JMenuItem** são itens que herdam da classe JMenu 

**Separator** classe que pode ser gerada para separar os itens de menu

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
Nome da variável | `Geração de código` utilizada como identificador principal
mnemonic | irá definir um atalho de acesso ao JMneu com `ALT + 'valor do campo'`
text | define o texto do JMenu
icon | define um ícone associado ao texto (text) do JMenu
accelerator | define uma tecla de atalho ao JMenuItem (diferentemente de mnemonic, ele abre o evento)

## Class - JDesktopPane

> Cria um ambiente preparado para receber os conteúdos de relatório no JFrame

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
Nome da variável | `Geração de código` utilizada como identificador principal
preferredSize | define o tamanho do JDesktopPane

## Class - JInternalFrame

> Cria uma janela GUI, que será exibida em uma JDesktopPane pode possuir "filhos" JPanel

**JPanel** é um painel utilizado como container, irá armazenar componentes de botões, labels e etc 

### Propriedades notáveis

**Nome da variável** (Geração de código) 

Propriedade | Característica
------------ | -------------
Redimensionamento Horizontal/Vertical | `layout` variável booleana que indica se o container irá expandir ou retrair de acordo com o tamanho do container "pai" que este está inserido
background | define a cor do backgroun do JPanel

# Componentes

## Class - JButton

> Componente de controle botão

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
Nome da variável | `Geração de código` utilizada como identificador principal
mnemonic | irá definir um atalho de acesso ao JButton com `ALT + 'valor do campo'`
text | define o texto do JButton
icon | define um ícone associado ao texto (text) do JButton
enabled | irá definir se o componente está habilitado para "click"
visible | irá definir se um componente será visível

## Class - JLabel

> Componente de controle para exibir informações

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
Nome da variável | `Geração de código` utilizada como identificador principal
text | define o texto do JLabel
font | define o tamanho, a fonte e o estilo da fonte exibida no JLabel
foreground | define a cor da fonte exibida no JLabel

## Class - JTextField

> Componente de controle para exibir informações, editar informações e de entrada de dados do usuário

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
Nome da variável | `Geração de código` utilizada como identificador principal
text | define o texto do JTextField
font | define o tamanho, a fonte e o estilo da fonte exibida no JTextField
foreground | define a cor da fonte exibida no JLabel
enabled | irá definir se o usuário poderá entrar com um texto na caixa de texto
editable | tem a mesma função do enabled, mantendo a cor da caixa padrão e permitindo seleção quando `false`

## Class - JComboBox

> Componente de controle para exibir informações em modo de lista

### Propriedades notáveis

Propriedade | Característica
------------ | -------------
Nome da variável | `Geração de código` utilizada como identificador principal
text | define o texto do JLabel
font | define o tamanho, a fonte e o estilo da fonte exibida no JLabel
foreground | define a cor da fonte exibida no JLabel

## Métodos

**dipose()** - irá fechar a janela 

**requestFocus()** - irá focar no JTextField específico que chamar o metódo

**setTitle(string title)** - irá definir o título da janela 













