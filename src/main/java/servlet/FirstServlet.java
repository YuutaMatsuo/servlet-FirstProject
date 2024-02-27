package servlet;
// サーブレット：webサーバー上（バックエンド）で動くJavaプログラム
// プログラムに変更を加えたら、サーバーを再起動させる

// ポイント①：複数のパッケージをインポートする！
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// ポイント②：アノテーション機能で「URLパターン（マッピング名）」を指定する！
@WebServlet("/first")
// ポイント③：クラス宣言時に「HttpServlet」クラスを継承する！
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// ポイント④：doGet() / doPost() をオーバーライドする！
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// コンテンツタイプを指定
//		response.setContentType("text/html; charset=UTF-8");
		response.setContentType("ABCDE");
		// PrintWriterインスタンスを生成する(newしない！ getWriter()を使う)
		PrintWriter out = response.getWriter();
		// PrintWriterインスタンスのprintln()でタグを記載
		out.println("<html>");
		out.println("<head>");
		out.println("<title>はじめてのサーブレット</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Let's Servlet!</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}
