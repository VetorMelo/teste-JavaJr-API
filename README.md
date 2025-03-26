# ViaCepClient 🚀

Este projeto é um projeto simples em **Java** para consumir a API do **ViaCEP**. O objetivo é realizar uma requisição **HTTP GET** para obter os dados de um endereço a partir de um **CEP** e exibi-los no console.

---

## 🧐 Funcionalidades

✅ Realiza uma requisição **GET** para `https://viacep.com.br/ws/{cep}/json/`

✅ Obtém e exibe o **status HTTP** retornado pela API

✅ Lê e imprime a **resposta no formato JSON**

✅ Possui **tratamento de erros** para lidar com falhas de conexão ou indisponibilidade da API

---

## 🔧 Tecnologias Utilizadas

🚀 **Java** (versão compatível com HttpURLConnection)  
🔗 **HttpURLConnection** para comunicação HTTP  
📖 **Scanner** para leitura do corpo da resposta  
🛠️ **Tratamento de exceções** com try-catch  

---

## 🏃 Como Executar o Projeto?

1️⃣ Clone o repositório:
```sh
git clone https://github.com/seuusuario/ClienteViaCep.git
```

2️⃣ Compile e execute o código Java no seu ambiente de desenvolvimento.

---

## 📌 Exemplo de Saída

```json
{
  "Status HTTP": 200,
  "Resposta do servidor": {
    "cep": "03527-904",
    "logradouro": "Avenida Waldemar Carlos Pereira",
    "bairro": "Vila Matilde",
    "localidade": "São Paulo",
    "uf": "SP"
  }
}
```

---

## 🎯 Motivação do Projeto

Este projeto foi desenvolvido como parte de um **desafio técnico** para uma vaga de **Desenvolvedor Java Júnior**. O objetivo era consumir a API do **ViaCEP**, exibir o **status da requisição** e imprimir a **resposta no console**.

Durante o processo, aprendi conceitos fundamentais como:

✔️ **Manipulação de requisições HTTP em Java**  
✔️ **Leitura de InputStream**  
✔️ **Tratamento de erros com try-catch**  
✔️ **Importância da estruturação e legibilidade do código**  

---

## 💡 Aprendizados

✅ Como realizar **requisições HTTP GET** nativas em Java  
✅ Como manipular **fluxos de entrada (InputStream)**  
✅ Implementação de **tratamento de erros** para evitar falhas inesperadas  
✅ Aplicação de princípios de **Clean Code** para código mais organizado  

---

## 📌 Destaques do Código

- 🚀 Uso de **HttpURLConnection** para requisições HTTP eficientes.  
- 🛠️ Tratamento adequado de **exceções**, garantindo maior robustez.  
- 📖 Código **organizado e legível**, facilitando manutenção e escalabilidade.  

---

## 🎯 Conclusão

Este desafio foi um grande aprendizado e reforçou minha vontade de me aprofundar no **desenvolvimento backend com Java**. Mais do que simplesmente resolver um problema, percebi a importância de entender como construir uma **solução eficiente e escalável**.

📌 **Se quiser conferir o código e testar no seu ambiente, basta seguir as instruções acima!** 🚀

