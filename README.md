# 🚰 Water Notifier

Um lembrete simples em Java pra te avisar de tempos em tempos que tá na hora de beber água. Funciona no **Linux** usando pop-ups via `zenity`.

---

## 💡 Como funciona

Você define de quantos em quantos minutos quer ser lembrado, e o programa mostra uma notificação na tela com uma mensagem tipo:

> Hora de beber água! Levanta e toma um copo d'água!

---

## 🚀 Como usar

### 1. Instale o `zenity` (se ainda não tiver)

No Ubuntu/Debian e derivados:

```bash
sudo apt install zenity
```

---

### 2. Compile o projeto

Se tiver o Java instalado, só rodar:

```bash
javac WaterNotifier.java
```

---

### 3. Execute o programa

```bash
java WaterNotifier
```

Ele vai perguntar o intervalo (em minutos) e começar a te lembrar!

---

## 📦 Executável `.jar`

Se preferir, você pode empacotar o programa num `.jar` pra facilitar o uso:

```bash
javac WaterNotifier.java
jar cfe water-notifier.jar WaterNotifier WaterNotifier.class
```

Depois é só rodar com:

```bash
java -jar water-notifier.jar
```

---

## 🖱️ Criar um atalho (.desktop) pro app

Pra rodar com um clique (sem terminal):

1. Crie um arquivo `water-notifier.desktop` com o conteúdo abaixo:

```ini
[Desktop Entry]
Name=Water Notifier
Comment=Lembrete pra beber água
Exec=java -jar /CAMINHO/COMPLETO/ATÉ/water-notifier.jar
Icon=utilities-terminal
Terminal=true
Type=Application
Categories=Utility;
```

2. Substitua `/CAMINHO/COMPLETO/ATÉ/` pelo caminho onde está seu `.jar`.

3. Mova o `.desktop` pra sua área de trabalho ou aplicativos:

```bash
chmod +x water-notifier.desktop
mv water-notifier.desktop ~/Área\ de\ Trabalho/
```

Agora é só clicar e o app vai rodar em background te lembrando de beber água 🧃

---

## 🧪 Requisitos

- Java 8 ou superior
- Linux com suporte a `zenity`
- Terminal (se for rodar manualmente)

---

## 📋 Licença

MIT — fique à vontade pra usar, modificar e compartilhar!

---

## ✨ Ideias futuras

- Versão multiplataforma (Windows/Linux)
- Interface gráfica pra configurar
- Modo silencioso com log no terminal

---

Beba água, seu corpo agradece. 💧
