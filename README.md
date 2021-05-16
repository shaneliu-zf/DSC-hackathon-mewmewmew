# 2021 北區聯合黑客松<br>第一組企劃書 —— 早安，購物嗎owo?



## Authors
- 劉承軒 [shaneliu1010@gmail.com](mailto:shaneliu1010@gmail.com)
- 劉庭栖 [candice02110211@gmail.com](mailto:candice02110211@gmail.com)
- 劉新惠 [keymasherrong@gmail.com](mailto:keymasherrong@gmail.com)
- 廖沛歆 [c920705a@gmail.com](mailto:c920705a@gmail.com)
- 黃毓芳 [y920531@gmail.com](mailto:y920531@gmail.com)

## LICENSE
[MIT LICENSE](https://github.com/shane-liu-1010/DSC-hackathon-mewmewmew/blob/main/LICENSE)

## Problem to Solve
由於疫情日趨嚴峻，為避免群聚感染，許多消費者不得不放棄前往大型購物商場享受逛街的悠閒時光。
為此，我們想要模擬出一個線上購物商城。
我們希望完成的作品不只有購物網站的選購功能，而是製作出虛擬商店模型，讓使用者在家也能夠擁有逛街購物的相同體驗。

## Technique Used
- Android Studio(Java)
- 樂高機器人 Mindstorms EV3

## How to Use
### Current
進入應用程式後，可在介面上透過按鍵選擇下一間或上一間店面。
每間主題商店會提供多種相關商品，使用者可參閱貨品照片決定是否要參閱詳細資訊。

### Ideal
讓使用者可透過遠端控制的鏡頭，模擬購物畫面。

## Further Plan
雖然這次礙於時間及技術限制，尚未裝設實境相機，但我們希望未來這款App可以進一步實現以下的功能:
- 以自走車搭載鏡頭，讓使用者有臨場感，並且擴展AR/VR營造更為真實的逛街感受。
- 透過App下單購買所需要的商品，實現類似無人商店的採購型態。

## Miscellaneous
- [Github連結](https://github.com/shane-liu-1010/DSC-hackathon-mewmewmew)

- 樂高機器人正面
<img src="https://i.imgur.com/xSpdovP.jpg" width=60%>

- 樂高機器人側面
<img src="https://i.imgur.com/9hW4YKz.jpg" width=60%>

## Concepts
### Brainstorming
 - 線上單機遊戲/桌遊
 - 線上教學
 - 線上訊息、語音
 - 線上看診
 - 直播
 - 外送
 - 遠端操控夾娃娃機
 - AR/MR
 - 街景購物

### Final Concept
#### 定案 : 虛擬店面線上購物

由鏡頭拍攝陳列在商品或架上的貨物，消費者在家中透過軟體參逛各店面並選購商品。
對於有興趣的商品可以透過軟體操縱機器掃描貨品上的QR Code，進一步查看更多商品的相關資訊。

#### 展望

以自走車搭載鏡頭使移動更真實，並且擴展AR/VR營造更為真實的逛街感受。
透過App下單購買所需要的商品，實現類似無人商店的採購型態，滿足後疫情時代，大家對出門逛街、購物的渴望。

### Possible Ways to Achieve Our Goal
 - Java(Android Studio)
 - ZXing(QR Code API)
 - Agora(影像傳輸)
 - Arduino or 樹莓派 or EV3(自走車)
 - App Inventor2(避免最後Android Studio寫不出來）

### Minimum Viable Concept
完成傳統購物App的基本架設，讓使用者可以在應用程式中瀏覽商品照片，並在商品下方放入商品介紹。