import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomErrorModal {

	private static final Random random = new Random();

	/**
	 * 画面内のランダムな位置にエラーモーダルダイアログを表示する
	 *
	 * @param parent  親フレーム（null可）
	 * @param title   ダイアログのタイトル
	 * @param message エラーメッセージ
	 */
	public static void showRandomError(Component parent, String title, String message) {
		// JOptionPaneを作成（アイコンをERROR_MESSAGEに設定）
		JOptionPane optionPane = new JOptionPane(
				message,
				JOptionPane.ERROR_MESSAGE,
				JOptionPane.DEFAULT_OPTION
		);

		// モーダルダイアログを生成
		JDialog dialog = optionPane.createDialog(parent, title);
		dialog.setModal(true);

		// 画面全体のサイズを取得
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		// ダイアログ自身のサイズを取得
		Dimension dialogSize = dialog.getSize();

		// 画面からはみ出さない最大座標を計算
		int maxX = Math.max(0, screenSize.width - dialogSize.width);
		int maxY = Math.max(0, screenSize.height - dialogSize.height);

		// ランダムな座標を設定
		int randomX = random.nextInt(maxX + 1);
		int randomY = random.nextInt(maxY + 1);
		dialog.setLocation(randomX, randomY);

		// ダイアログを表示（モーダルなので閉じられるまでここで処理が止まる）
		dialog.setVisible(true);
		dialog.dispose();
	}

	// 動作確認用のmainメソッド
	public static void main(String[] args) {
		// SwingのUI操作はEDT（イベントディスパッチスレッド）上で実行する
		SwingUtilities.invokeLater(() -> {
			for (int i = 1; i <= 3; i++) {
				showRandomError(null, "システムエラー (" + i + "/3)", "予期せぬエラーが発生しました。");
			}
		});
	}
}
