
# 🧩 Install Latest Guest Additions on Kali Linux VirtualBox (Manually)

> Not the outdated one provided by VirtualBox!  
Fix issues like:
- 🖱️ Cursor turning into pixel glitch
- 🖥️ Screen not resizing / full screen not working
- 📋 Clipboard not working between host and VM
- 📂 Drag and Drop not working

---

## 🧩 Step-by-Step Installation Guide

### 📦 Step 1: Update Kali & Install Essentials
```bash
sudo apt update && sudo apt full-upgrade -y
sudo apt install -y build-essential module-assistant dkms linux-headers-$(uname -r)
```

💡 **If that gives errors about headers**, run:
```bash
sudo apt install -y linux-headers-amd64
```

---

### 💿 Step 2: Install ISO-based Guest Additions (Safe Method)
```bash
sudo apt install -y virtualbox-guest-additions-iso
```
> This installs the **clean ISO** inside Kali — no need to use the outdated VBox menu ISO.

---

### 🔧 Step 3: Mount & Run the ISO
```bash
sudo mkdir -p /mnt/vbox
sudo mount /usr/share/virtualbox/VBoxGuestAdditions.iso /mnt/vbox
cd /mnt/vbox
sudo ./VBoxLinuxAdditions.run
```

🔍 **Note:** This ISO is newer and works with latest kernels like 6.12+.

---

### 🔁 Step 4: Reboot the VM
```bash
sudo reboot
```

---

### 🖥️ [OPTIONAL] Step 5: If `.run` Fails (Install GUI Features Only)
If the `.run` script fails with kernel module errors (like `no_llseek`):

```bash
sudo apt install -y virtualbox-guest-utils virtualbox-guest-x11
```

✅ This gives you:
- Clipboard sharing
- Screen resizing
- Shared folders
- Drag and drop  
(Even without building kernel modules)

---

## 🧠 Fix Square Cursor Glitch

If your cursor becomes a **glitchy square block**, do this:

> 🛑 Power off the VM  
> 🛠️ Open: VirtualBox → Kali → `Settings → Display`

- ❌ **Uncheck**: Enable 3D Acceleration  
- ✅ **Set Video Memory**: 128 MB  

Then boot the VM.  
✅ Glitch should be gone.

---

## 🔧 [OPTIONAL] Fix `libkmod` Error on Boot

If you see this error:
```bash
libkmod: ERROR: Directories inside directories are not supported: /etc/modprobe.d/virtualbox-dkms.conf
```

Fix it with:
```bash
sudo rm -rf /etc/modprobe.d/virtualbox-dkms.conf
sudo touch /etc/modprobe.d/virtualbox-dkms.conf
```

---

## ✅ Final Summary

| Task                         | Status                           |
|-----------------------------|----------------------------------|
| Avoid `.run` errors         | ✅ Use `virtualbox-guest-additions-iso` |
| GUI features (clipboard, drag-drop) | ✅ `virtualbox-guest-x11`       |
| Pixel cursor glitch         | ✅ Disable 3D Acceleration        |
| Kernel build failures       | ✅ Avoid outdated VBox ISO        |

---

## 💥 Final Status

✅ Proper Guest Additions  
✅ Full-screen + resolution works  
✅ Clipboard + drag-and-drop between host and VM  
✅ No weird mouse glitch  
✅ Stable + clean install for modern Kali Linux  
