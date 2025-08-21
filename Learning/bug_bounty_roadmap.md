# 🛡️ Bug Bounty & Web App Pentesting Roadmap

> **Designed for mastering modern web app hacking & bug bounty hunting.**

---

## ✅ Phase 1: Core Vulnerabilities (Hands-On First)

**Resources:** HTB Bug Bounty Path • Rana Khalil’s Course • PortSwigger Labs

| Week | Topics                       | HTB Modules                             | WSA Labs                           |
| ---- | ---------------------------- | --------------------------------------- | ---------------------------------- |
| 1–2  | XSS (Reflected, Stored, DOM) | Cross-Site Scripting, DOM XSS           | Cross-site scripting, DOM-based    |
| 3    | File Upload Exploitation     | File Upload Attacks                     | File upload vulnerabilities        |
| 4    | Command Injection            | Command Injection, OS Injection         | OS command injection               |
| 5    | Authentication & Sessions    | Authentication Testing, Session Attacks | Authentication, Session management |
| 6    | IDOR & Access Control        | IDOR, Access Control Testing            | Access control vulnerabilities     |
| 7    | SSRF                         | SSRF, Advanced SSRF                     | SSRF                               |
| 8    | CSRF + Business Logic        | CSRF, Logic Flaws                       | CSRF, Logic vulnerabilities        |

**Weekly Plan:**

- 📺 Watch Rana Khalil’s explanation
- 🧪 Complete 3–6 PortSwigger Labs
- 🛠️ Do corresponding HTB modules
- 📝 Write Markdown notes: attack flow, payloads, bypasses, screenshots

---

## 🔁 Phase 2: API Pentesting

**Resources:** HTB Bug Bounty Path • WSA Labs • Tools (Postman, Arjun, Burp Suite)

| Week | Topics                     | HTB Modules                            | WSA Labs            |
| ---- | -------------------------- | -------------------------------------- | ------------------- |
| 9–10 | API Auth Bypass, BOLA      | API Security, Broken Object-Level Auth | API vulnerabilities |
| 11   | Mass Assignment, Filtering | Mass Assignment, Rate Limiting         | Mass assignment     |
| 12   | CORS, Headers              | CORS Misconfig, Security Headers       | CORS                |

---

## 🧠 Phase 3: EWPT + Advanced Vulns (Theory + Self-Practice)

**Resources:** EWPT PDF (theory only) • PortSwigger Advanced Labs • HackTricks

| Week | Topics                        | From EWPT                 | Practice                    |
| ---- | ----------------------------- | ------------------------- | --------------------------- |
| 13   | HTTP Protocol Deep Dive       | Intro + Headers + Cookies | Burp traffic analysis       |
| 14   | Authentication Flow Abuse     | Login/Reset/2FA bypass    | DVWA, Juice Shop            |
| 15   | Race Conditions, Logic Bugs   | Logic flaws section       | PortSwigger labs            |
| 16   | WebSockets, GraphQL           | Advanced modules          | GraphQL playground, Postman |
| 17   | LFI, RFI, Path Traversal      | File vuln sections        | TryHackMe, HackTricks       |
| 18   | WAF Bypass & Payload Crafting | Bypassing filters         | Fuzzing + custom payloads   |

---

## 🧰 Toolkit Stack

| Tool                     | Purpose                                        |
| ------------------------ | ---------------------------------------------- |
| Burp Suite Pro           | Interception, Repeater, Intruder, Collaborator |
| ffuf / dirsearch         | Directory fuzzing                              |
| Arjun / Paramspider      | Hidden parameter discovery                     |
| nuclei                   | Fast vulnerability scanning                    |
| httpx + dnsx + subfinder | Recon stack                                    |
| Postman                  | API testing                                    |
| HackTricks               | Payloads, bypasses, and practical tricks       |

---

## 📁 Suggested GitHub Repo Structure

```
bug-bounty-roadmap/
├── SQL Injection/
├── XSS/
├── File Upload/
├── IDOR/
├── SSRF/
├── APIs/
├── Business Logic/
├── EWPT Theory Notes/
├── Labs-Screenshots/
└── Tools-CheatSheets/
```

Each folder:

- `README.md` with topic explanation
- Payload cheat sheets
- Screenshots & lab write-ups

---

## ✅ Visual Tracking Board (Notion/Trello)

**Board Columns:**

- `To Learn`
- `In Progress`
- `Practiced in Labs`
- `Understood Deeply`
- `Tried on Real Targets`

> Track each topic/module/lab as a card. Move it through columns. You’ll see your growth clearly.

---

## 🧠 Bonus: Practice Targets

- [DVWA](https://github.com/digininja/DVWA)
- [Juice Shop](https://github.com/juice-shop/juice-shop)
- [Mutillidae](https://github.com/webpwnized/mutillidae)
- [WebGoat](https://github.com/WebGoat/WebGoat)
- [TryHackMe Labs](https://tryhackme.com/)
- [HackTheBox Pro Labs](https://www.hackthebox.com/prolabs)

---

Stay consistent. Document everything. Use visuals, take notes, and most importantly — practice what you learn.

**You’re not just studying. You’re sharpening your weapon.** 🗡️

