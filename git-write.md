## ✅ What Is Markdown?

Markdown is a lightweight markup language used to format plain text. GitHub automatically **renders** `.md` files to look beautiful with headings, images, tables, code blocks, etc.

---

## 📘 Basic Markdown Structure (Cheat Sheet)

| Feature             | Syntax                           | Example                                 | Rendered                                    |
| ------------------- | -------------------------------- | --------------------------------------- | ------------------------------------------- |
| **Heading 1**       | `#`                              | `# Kali Linux Guide`                    | <h1>Kali Linux Guide</h1>                   |
| **Heading 2**       | `##`                             | `## Installation`                       | <h2>Installation</h2>                       |
| **Bold**            | `**text**`                       | `**Important**`                         | **Important**                               |
| **Italic**          | `*text*`                         | `*tip*`                                 | *tip*                                       |
| **Strikethrough**   | `~~text~~`                       | `~~deprecated~~`                        | ~~deprecated~~                              |
| **Line break**      | (end line with 2 spaces)         | `Line 1  `<br>`Line 2`                  | Line 1<br>Line 2                            |
| **Horizontal rule** | `---`                            | `---`                                   | ———                                         |
| **Bullet list**     | `- item` or `* item`             | `- Kali`<br>`- Parrot`                  | - Kali<br>- Parrot                          |
| **Numbered list**   | `1. item`                        | `1. Download`<br>`2. Install`           | 1. Download<br>2. Install                   |
| **Link**            | `[text](url)`                    | `[HTB](https://academy.hackthebox.com)` | [HTB](https://academy.hackthebox.com)       |
| **Image**           | `![alt](url)`                    | `![Kali](https://imgur.com/kali.png)`   | ![Example](https://i.imgur.com/iKrMsiX.png) |
| **Inline code**     | `` `code` ``                     | `` `ls -la` ``                          | `ls -la`                                    |
| **Code block**      | <pre>`bash<br>command<br>`</pre> | <pre>`bash<br>apt update<br>`</pre>     | see below                                   |
| **Blockquote**      | `> text`                         | `> Tip: Use sudo`                       | > Tip: Use sudo                             |
| **Table**           | See below                        | See below                               | See below                                   |

---

## 🧪 Example: Code Block

```bash
sudo apt update
sudo apt install virtualbox
```

Use triple backticks (\`\`\`) above and below the code. You can also specify the language (`bash`, `python`, `php`, etc.) to add syntax highlighting.

---

## 🧾 Example: Table

```markdown
| Tool         | Purpose                  |
|--------------|--------------------------|
| Burp Suite   | Intercept HTTP Requests  |
| FFUF         | Fuzz URLs and Parameters |
```

Renders as:

| Tool       | Purpose                  |
| ---------- | ------------------------ |
| Burp Suite | Intercept HTTP Requests  |
| FFUF       | Fuzz URLs and Parameters |

---

## 📷 Inserting Images (from Imgur or Local)

* If your image is hosted:

  ```markdown
  ![](https://i.imgur.com/iKrMsiX.png)
  ```
* If you want to reference an image in the `images/` folder of your repo:

  ```markdown
  ![](images/screenshot1.png)
  ```

👉 GitHub automatically shows them in the `.md` preview.

---

## 🧠 Pro Writing Tips (for Pentesting Markdown Files)

* Always start with a **title** and **brief summary** at the top.
* Use **Headings** to divide sections: Setup, Enumeration, Exploitation, PrivEsc, etc.
* Add **commands in code blocks**.
* Use **images** right after important steps (proof of concept, flags).
* Add **tables** to organize bypasses, tools, and payloads.
* Keep it clean — prefer `##` for major sections, `###` for sub-points.

