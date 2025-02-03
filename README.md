# oxefood-api-david

# JWT, ou JSON Web Tokens, é um padrão que, em grande parte, é usado para a segurança em APIs REST. Embora seja uma tecnologia relativamente nova, ela vem ganhando popularidade rapidamente.
# No processo de autorização do JWT, o front-end (o client) primeiramente envia algumas credenciais para se autenticar (nome de usuário e senha, em nosso caso).
# O servidor (a aplicação com Spring, em nosso caso), em seguida, verifica essas credenciais. Se elas forem válidas, o servidor gera um JWT e o retorna.
# Depois desse passo, o client precisa fornecer esse token no cabeçalho Authorization da solicitação, no formulário “Bearer TOKEN” (Token do portador). O back-end verificará a validade desse token e autorizará ou rejeitará as solicitações. O token também pode armazenar funções de usuário e autorizar as solicitações com base na autoridade fornecida.

# O Spring Security é uma biblioteca que fornece proteção, mas também autenticação, autorização e armazenamento de senhas. Sendo que trabalha com vários protocolos para autenticação. Iremos utilizar como protocolo de autenticação o JWT.

