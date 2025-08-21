# 🧰 VS Code Setup Guide for Web Development (HTML, CSS, JS) on Windows

This guide will walk you through installing Visual Studio Code on Windows and configuring it with essential extensions and settings for efficient web development using HTML, CSS, and JavaScript.

---

## 🧱 Step 1: Install Visual Studio Code

### 🔗 Download:

- Go to the official website: [https://code.visualstudio.com/download)
- Click on **"Download for Windows"** and choose the **User Installer** (recommended).

### 📦 Installation:

1. Run the downloaded `.exe` file.
2. Accept the agreement and click **Next**.
3. Choose the install location or leave it as default.
4. **Check the boxes**:
   - Add to PATH (important)
   - Register Code as an editor for supported file types
   - Create Desktop icon (optional)
5. Click **Install**, then **Finish**.

---

## 🧰 Step 2: Launch VS Code

- Open **Visual Studio Code** from the Desktop or Start Menu.

---

## 🧩 Step 3: Install Essential Extensions

Click on the **Extensions icon** in the sidebar (or press `Ctrl+Shift+X`) and search for these extensions:

| Extension Name                     | Purpose                                          |
| ---------------------------------- | ------------------------------------------------ |
| **Live Server**                    | Launch local development server with live reload |
| **Prettier** or **Beautify**       | Auto-format code to look clean and consistent    |
| **HTML CSS Support**               | Autocomplete and IntelliSense for HTML/CSS       |
| **JavaScript (ES6) code snippets** | Fast JS boilerplate and common patterns          |
| **Auto Rename Tag**                | Automatically renames matching HTML tags         |
| **Path Intellisense**              | Autocomplete file paths in HTML & JS             |
| **Color Highlight**                | Highlights CSS color codes                       |
| **Bracket Pair Colorizer 2**       | Helps visually match opening/closing brackets    |

---

## ⚙️ Step 4: First Hello web code 

1. Open VS Code
2. Go to **File > Open Folder...** and create a folder called `WebDevPractice`
3. Inside that folder, create three files:
   - `index.html`
   - `style.css`
   - `script.js`

```html
<!-- index.html -->
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Web Dev Starter</title>
  <link rel="stylesheet" href="style.css">
</head>
<body>
  <h1>Hello Web!</h1>
</body>
</html>
```

---

## 🚀 Step 5: Run with Live Server

1. Right-click on `index.html`
2. Select **"Open with Live Server"**
3. It will launch in your default browser with **live reload** (auto refreshes when you save).

---

## 🛠️ Optional VS Code Settings for Web Dev

### 👉 Auto Save:

Go to `File > Auto Save` to enable automatic saving.

### 👉 Format on Save:

1. Press `Ctrl + ,` to open Settings
2. Search for `format on save`
3. Enable the checkbox

### 👉 Set Default Formatter:

1. Search for `default formatter`
2. Choose `esbenp.prettier-vscode` if using Prettier

---

## 🧠 Tips:

- Use `Ctrl + Space` for suggestions
- Use Emmet (built-in) like `! + Tab` in HTML for boilerplate
- Keep your files organized in folders (`images`, `js`, `css`)

---


