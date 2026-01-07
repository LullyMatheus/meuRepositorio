# Curso de Git e GitHub

## Aula 1

O git nao foi o primeiro software de controle de versoes. Na verdade existiram muitos
antes dele. Alguns dependiam de repositorios centralizados, mas os mais modernos
(como o git) trabalham com repositorios distribuidos. Alem do git, uma outra 
tecnologia interessante de controle de versoes se chama BitKeeper.

---

## Aula 2

Opções que existem além do GitHub: GitLab, BitBucket, Phabricator, Gogs, Kallithea
O Git foi criado pelo Linus Torvalds, que liderou o projeto Linux

---

## Aula 4

VCS: Version Control Software  
SCM: Source Code Management  
O Git é um VCS

---

## Aula 5

Sempre crie os repositorios com um arquivo README, ele é importante para para GitHub
License: MIT License é bom para repositórios públicos. Ler os detalhes depois.
Ao criar um novo arquivo no VSCode, é comum aparecer a letra 'U' na frente. 
Isso significa 'Untracked'. Ou seja, o git ainda não registra as versões desse arquivo
até você fazer o primeiro commit. 
Depois do primeiro commit, começa a aparecer 'M', de Modified, quando você altera um arquivo.

---

## Aula 8

Arquivo gitignore: utilizado para que o git não monitore determinado arquivo.
No github desktop, antes de fazer um commit, você pode clicar com botão direito em 
um arquivo e vai aparecer a opção de "ignorar" (criar gitignore). Ignorar significa
que o git não vai versionar esse arquivo e nem mandá-lo para o github.

- Existe uma diferença entre clone e fork. Quando você clona um repositório, ele 
  vai aparecer na sua máquina como um repositório local, mas você não vai fazer commits e 
  pushs para o repositório remoto. Se quiser fazer isso, você cria um fork. Nesse caso, 
  cria-se um repositório remoto para você fazer as suas próprias modificações no código base.

- Issues são uma forma de se comunicar com outros programadores no GitHub

---

## Aula 9

Como usar issues?
Situação exemplo: você encontrou um problema no vscode.
O vscode está disponivel no github, então você pode criar uma issue falando do seu problema
por lá. Assim, você deverá receber algum retorno dos desenvolvedores.
Caso você queira tentar resolver o problema, você cria um fork do projeto, cria uma brench
só para resolver esse problema, e se conseguir você faz um pull request, para que os 
desenvolvedores avaliem se sua solução pode ser implementada no projeto oficial.

Ao encontrar o problema em um projeto, primeiro verifique se já existe uma issue resolvida 
com o seu problema. Caso não exista, crie uma nova issue.

---

## Aula 10

Guia da linguagem Markdown!

- Deixar um termo em negrito: coloque entre dois asteriscos (dois de cada lado).
  Também funciona com dois underlines;

- Deixar em itálico: entre asteriscos (um de cada lado);

- Deixar riscado: dois til's de cada lado (~~);
  
  # Titulo (hashtag + espaço) Título de nível 1,
  
  ## Titulo (duas hashtags + espaço) Título de nível 2,
  
  ### Titulo (três hashtags + espaço) Título de nível 3,

- Adicionar uma linha horizontal: três hífens --- ou três asteriscos ***;

- Misturar configurações: dois underlines + asteriscos = itálico e negrito __*markdown*__;

- Listas númeradas: usar número + ponto;

- Lista não numerada: tracinho ou asterisco + espaço;

- Checkbox: - [] 
  
  - [x]

- [Exemplo de link](www.google.com)

- Tabelas

| Num | Nome    | Nota |
| --- | ------- | ---- |
| 1   | Matheus | 10   |

---

- Inserir comandos: use crases

- Meu programa: use três crases
  
  ```
  const btn = window.document.getElementbyId('btn')
  btn.disabled = true;
  ```

- Emojis: entre dois pontos ':' (dois pontos de cada lado)

- :smile:

- :hand_over_mouth:

- :eyes:

> Quote

Como diz Gabrielle Coimbra:

> Jesus Amado
