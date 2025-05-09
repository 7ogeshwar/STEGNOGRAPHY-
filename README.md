# 🖼️ Steganography in Java (Eclipse)

## 📌 Project Overview
This is a Java-based Steganography project built using the Eclipse IDE. It allows users to **hide secret text inside an image** and later **decode** it to retrieve the exact hidden message. The image remains visually unchanged, making it suitable for secure and invisible communication.

---

## 💡 Features

- ✅ Hide (encode) text inside an image
- ✅ Retrieve (decode) hidden text from the image
- ✅ Output image looks like a normal image
- ✅ Lossless and accurate extraction of the original message
- ✅ Can be used with PNG images (non-lossy format)

---

## 🛠️ How It Works

### 📥 Encoding:

- The program uses **Least Significant Bit (LSB)** steganography.
- It takes a secret message and hides it within the pixels of an image.
- The output is a new image with the same appearance but contains the secret text.

### 📤 Decoding:

- The encoded image is passed to the decoding function.
- It reads the LSBs of the pixels and reconstructs the hidden message.
- The extracted message is printed/displayed accurately.

---


