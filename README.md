# LibQrCode
 二维码工具引用

## 二维码工具

#### LQrCodeUtil
二维码工具类
* showQrCode 生成二维码到指定的ImageView
* analysisQrCode 解析二维码图片
* createQRCodeBitmap 生成二维码图片
* addBarcodeCodeListener 添加二维码扫描监听

#### AutoDecoratedBarcodeView
二维码扫描控件

···
    TextView tvStatus = barcodeScanner.getStatusView();
    tvStatus.setTextSize(30);
···