<section class="gray-bg section-padding" id="login">
    <div class="container" >
        <div class="testimonial">
            <a class="links" id="paracadastro"></a>
            <a class="links" id="paralogin"></a>

            <div class="content">
                <g:form controller="login">
                    <h1>Cadastre-se</h1>

                    <p><g:textField name="username" placeholder="Nome" /></p>

                    <p><g:textField name="email" placeholder="Email" /></p>

                    <p><g:passwordField name="password" placeholder="Senha" /></p>

                    <g:actionSubmit value="Cadastrar" action="create" class="btn btn-primary" />
                </g:form>
            </div>
        </div>

    </div>
</section>