## コンポーネント粒度について

<img width=250 src="https://github.com/user-attachments/assets/505cdd5d-7584-49b5-85b7-21a0923570c4"/>

`Screen`, `Section`, `Component`の三つのレベルに分類している

- Screen : `MainScreen`や`MainViewModel`などが属する
- Section : `ArticleContent`などが属する
- Component : `ArticleItem`などが属する

依存関係は`Screen → Section → Component`の一方向とする

## detekt
detektプラグインは以下にある複数のタスクを生成する
- detekt: ソースファイルに対してdetekt解析と複雑さのレポートを実行する。レポートは`xml`, `htm`, `txt`, `md`, `sarif`形式で自動的に生成され、それぞれ`build/reports/detekt.[前述のいずれかの拡張子]`にある
- detektGenerateConfig: デフォルトのdetekt設定ファイルをプロジェクトディレクトリに生成する
- detektBaseline: detelktと似ているが、現在のコードベースの既存の問題を基準(ベースライン)として記録するためのタスク。このタスクを実行することで、既存のコードの警告やエラーが無視され、新たに追加されたコードや変更されたコードに対してのみdetektが違反を検出するようになる。具体的に、このタスクを実行すると、detektの設定ファイルに指定されたルールに基づいて、現在のコードベースの違反を検出し、その違反を`baseline.xml`に保存する。その後、通常の`detekt`チェックを実行すると、`baseline.xml`に記録されている違反は無視される。そうすることで、既存のコードに多数の違反がある場合でも、新規のコードや変更したコードに対してのみ違反検出を行うことができる。

## gradle

sttings.gradleのついて： https://qiita.com/takagimeow/items/1077e8ed82bf9c46a16d <br>

