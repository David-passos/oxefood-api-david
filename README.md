# oxefood-api-david

# JWT, ou JSON Web Tokens, é um padrão que, em grande parte, é usado para a segurança em APIs REST. Embora seja uma tecnologia relativamente nova, ela vem ganhando popularidade rapidamente.
# No processo de autorização do JWT, o front-end (o client) primeiramente envia algumas credenciais para se autenticar (nome de usuário e senha, em nosso caso).
# .antMatchers("/empresa/{id}").permitAll()
# O Spring Security é uma biblioteca que fornece proteção, mas também autenticação, autorização e armazenamento de senhas. Sendo que trabalha com vários protocolos para autenticação. Iremos utilizar como protocolo de autenticação o JWT.
# Transactional garante que toda operação ocorra de forma transacional, caso tenha algum erro, todas as mudanças serao desfeitas



# O Que é autenticação:
     Autenticação representa a forma de como o usuário prova quem realmente ele é: username + password, biometrias, etc.


# O Que é autorização :
    A autorização define o que pode e o que não pode acessar

# O Que é auditoria:
    Auditoria “... suporte para acompanhar de forma transparente quem criou ou alterou uma entidade e o momento em que isso aconteceu.” Registrar atividades realizadas, Quem, quando, em qual IP.

 # implemente neste repositorio uma consulta que vai filtrar o cliente pelo cpf e nome:
    @Query(value = "SELECT c FROM Cliente c WHERE c.cpf = :cpf And c.nome = nome")
    List<Cliente> conulstarPorCpf(String cpf, String nome);


# O que é REST:
    Representational State Transfer, abreviado como REST, não é uma tecnologia, uma biblioteca, e nem tampouco uma arquitetura, mas sim um modelo a ser utilizado para se projetar arquiteturas de software distribuído, baseadas em comunicação via rede.

# API Web RESTful
    Esta API apresenta funcionalidades expostas através de métodos HTTP tais como GET, POST ou PUT e pode ser consumida em qualquer linguagem moderna, seja por aplicativos Web, dispositivos móveis ou dispositivos da Internet das coisas.

# Swagger 
    O Swagger é um projeto open source que contempla diversas ferramentas para documentação, consumo e visualização de serviços RESTful, entre essas ferramentas, temos o framework para documentação legível de APIs, esse framework implementa a especificação OpenAPI, que é uma linguagem para descrição de contratos de APIs REST. 

#  .requestMatchers(HttpMethod.GET, "/cliente/*").permitAll()
#  .requestMatchers(HttpMethod.DELETE, "/cliente/*").permitAll()
# Cliente Request As validações aplicadas nessa classe garantem que os dados enviados na requisição HTTP estejam corretos antes mesmo de serem processados pelo sistema

# As validações de Cliente atuam no banco de dados, garantindo que os dados persistidos estejam consistentes com as regras de negócio

# NotNull  Garante que o campo não seja null, mas permite que ele seja uma string vazia

# NotBlank Garante que o campo não seja null e não esteja vazio ou apenas com espaços em branco.

#    exemplo de clientes para empresa
     @ManyToOne
    @JoinColumn(name = "empresa_id", nullable = false)
    private Empresa empresa;

# exemplo de empresa para clientes   
    @JsonIgnore
    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Cliente> clientes;
