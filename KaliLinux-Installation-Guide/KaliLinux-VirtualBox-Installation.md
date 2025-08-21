# 🐱‍💻 Kali Linux Installation Guide (VirtualBox on Windows)

> ⚡ A beginner-friendly, step-by-step guide to install and set up Kali Linux on VirtualBox using a Windows machine. Includes screenshots for every step.

---

### ✅ 1. Download Required Files

- **Download VirtualBox for Windows:**\
  [https://www.virtualbox.org/wiki/Downloads](https://www.virtualbox.org/wiki/Downloads)

- **Download Kali Linux VirtualBox Image (ZIP):**\
  [https://www.kali.org/get-kali/#kali-virtual-machines](https://www.kali.org/get-kali/#kali-virtual-machines)

---

### ⚙️ 2. Set Up the Virtual Machine

1. **Open VirtualBox and click **New** to create a new VM:**\
![](images_kali/1.click_new.png)


2. **Enter a name, select machine folder, choose **Linux** as Type, and **Debian (64-bit)** as Version:**\
![](images_kali/2.create_machine.png)


3. **Allocate RAM and processors** (Minimum: 2 GB RAM, 2 CPUs):\
![](images_kali/3.specify_ram&processor.png)


4. **Create a virtual hard disk** (Minimum: 20 GB. Recommended: 35–40 GB for tools and bug bounty utilities):\
![](images_kali/4.specify_hard_disk_size.png)


5. **Click **Finish** to create the virtual machine:**\
![](images_kali/5.machine_created.png)


---

### 🔧 3. Attach the Kali Linux Disk Image

6. **Click on the new VM and open its **Settings** by pressing right click on new VM:**\
![](images_kali/6.click_settings.png)


7. **Go to **Storage section** > click the empty SATA slot > choose a disk file:**\
![](images_kali/7.select_kali.vdi_file.png)


8. **Browse and select the extracted **.vdi** file from the Kali Linux ZIP:**\
![](images_kali/8.select_downloaded_file.png)



### 🚀 4. Start and Log In to Kali Linux

9. **Double-click the VM to start Kali Linux.**\
   Default credentials:
   - Username: `kali`
   - Password: `kali`&#x20;
![](images_kali/9.default_login.png)



### 🛠️ 5. Update the Kali Linux System

10. **Open Terminal** (`Ctrl + Alt + T`) and run the following command:

```bash
sudo apt update && sudo apt upgrade -y && sudo apt autoremove -y
```
![](images_kali/10.update_upgrade&autoremove.jpg)


This updates all installed packages to their latest versions and removes unnecessary ones.
![](images_kali/11.updating_kali.jpg)


---

### ✅ 6. Done! Kali Linux is Ready to Use

11. **You now have a fully functioning Kali Linux setup on VirtualBox.**\
    Start exploring, installing tools, or begin your ethical hacking journey!\


---

### 🙌 Tips

- Always keep your system updated.
- Take snapshots after installing important tools.
- Disable sleep/lock settings to keep your VM always awake (if needed).

---