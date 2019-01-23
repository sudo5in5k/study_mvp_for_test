### ユーザがXXしたら、YYして、ZZを表示する

* XX: Viewが呼ぶPresenterのInterface
* YY: Presenterの中で行うBusiness Logic
* ZZ: Presenterを呼ぶViewのInterface

* ex. チュートリアル画面でユーザがスキップボタンをクリックしたらダイアログを閉じて、最初の画面を表示する

Contract(Contractor): ViewとPresenterをつなぐinterface

```kotlin
interface TurotialContract {

	interface Presenter {
		fun clickSkipButton()
	}

	interface View {
		fun showFirstActivity()
	}
}
```

ex. 画面が表示されたらDBからTweetを取得して、リストに表示する
```kotlin
interface Contract {

     interface Presenter {
     	fun onShowed()
     }

     interface View {
     	fun showList(tweetList: List<Tweet>)
     }
}
```

### Viewに条件分岐は書かない

### Presenterをテスト可能にするために

* static呼び出し
* new
せず、

```
Presenterのコンストラクタで注入する
```



