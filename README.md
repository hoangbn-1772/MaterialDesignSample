# MaterialDesignSample

# Layout
- Material Design layouts khuyến khích tính nhất quán giữa các nền tảng, môi trường và kích thước màn hình bằng cách sử dụng các yếu tố và khoảng cách đồng nhất.
## Nguyên tắc
- Predictable (dự đoán): UI nên sử dụng bố cục trực quan và thân thuộc với người dùng.
- Consistent (thích hợp): Layout nên sử dụng grid, keyline, padding nhất quán.
- Response (đáp ứng): Layout có khả năng đáp ứng với các tương tác từ user, device và screen.

## Structure
- Material Design layout tạo sự cân bằng thị giác cho người dùng, tạo một giao diện nhất quán, đẹp, chuyên nghiệp. Hầu hết các phép đo đều phù hợp với grid 8dp  điều chỉnh cả khoảng cách và bố cục tổng thể.
- Các thành phần nhỏ hơn như biểu tượng, kiểu chữ có thể căn chỉnh theo grid 4dp.

<img class="ml mm gu n o gt ab gr" width="1000" height="441" src="https://miro.medium.com/max/1000/1*Kcx60oAWZioon-V_RR-IQA.png">

- Một giao diện nhất quán tạo ra sự chuyên nghiệp và độ tin cậy.
- Tại sao lại là 8dp? 
	+ Do sự đa dạng về kích thước màn hình và mật độ pixel tạo nên sự phức tạp cho các nhà thiết kế.
	+ Phần lớn kích thước màn hình phổ biến chia hết cho 8, giúp dễ dàng điều chỉnh
- Giá trị của hệ thống lưới 8dp:
	+ For designers
	+ For teams
	+ For users

## Pixel density
- Tính toán mật độ điểm ảnh (pixel): <b>Screen density = Screen width (or height) in pixels / Screen width (or height) đơn vị inche</b>

<img src="images/display_pixel_density.png"/>

- Đơn vị dp: Là đơn vị linh hoạt có tỷ lệ để có kích thước đồng đều trên bất kỳ màn hình nào. Material UIs sử dụng đơn vị dp để hiển thị các thành phần trên màn hình với mật độ khác nhau.

<img alt="" aria-describedby="density-independence-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1QqdZ48smdRjk9itSexZz2DcWI92iXxR7%2Flayout-unitsmeasurements-pixeldensity-lowhigh.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1QqdZ48smdRjk9itSexZz2DcWI92iXxR7%2Flayout-unitsmeasurements-pixeldensity-lowhigh.png">

- 1dp = 1pixel trên màn hình có mật độ 160. Để tính toán dp ta sử dụng công thức: <b>dp = (width in pixels * 160) / screen density</b>

<img src="images/calculate_dps.png"/>

- Đơn vị sp: phục vụ như chức năng của dp nhưng áp dụng với phông chữ.

## Responsive layout grid
- Layout grid được tạo thành từ 3 thành phần: columns, gutters và margins

	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1P_b7NIZ5_IBvs9VraJx7tu8KO-dUZXJW%2Flayout-responsive-columns-margins-gutters.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1P_b7NIZ5_IBvs9VraJx7tu8KO-dUZXJW%2Flayout-responsive-columns-margins-gutters.png">

	+ Columns: Nội dung được đặt trong các khu vực của màn hình có chứa các cột. Độ rộng của các cột được xác định bằng tỷ lệ phần trăm (thay vì giá trị cố định) để nội dung thích ứng linh hoạt với mọi 			   kích thước màn hình. Số lượng columns phụ thuộc vào kích thước màn hình.
	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1XzRkl-dQpZybJMje81knhzgS24kQkBns%2Flayout-responsive-columns-360.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1XzRkl-dQpZybJMje81knhzgS24kQkBns%2Flayout-responsive-columns-360.png">

	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-2" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1HvKFIQPbDzU3NMF_ww5lvbHilht1bmoi%2Flayout-responsive-columns-600.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1HvKFIQPbDzU3NMF_ww5lvbHilht1bmoi%2Flayout-responsive-columns-600.png">

	+ Gutters: Khoảng cách giữa các cột. Có giá trị cố định theo từng kích thước màn hình.
	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-3" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1X3yLriF6STNMsF_J-G-lPqqWxEsjSGeA%2Flayout-responsive-gutters-360.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1X3yLriF6STNMsF_J-G-lPqqWxEsjSGeA%2Flayout-responsive-gutters-360.png">

	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-4" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1SRIW3KwxGPkJk4INc3OZM_3ZBEPOjbYg%2Flayout-responsive-gutters-600.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1SRIW3KwxGPkJk4INc3OZM_3ZBEPOjbYg%2Flayout-responsive-gutters-600.png">

	+ Margins: Là khoảng cách giữa nội dung và các cạnh trái và phải của màn hình. Có giá trị cố định theo từng kích thước màn hình.
	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-5" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1KEfrUmIS_cTjLcQdgmkI6ISccOmF0jMd%2Flayout-responsive-margins-360.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1KEfrUmIS_cTjLcQdgmkI6ISccOmF0jMd%2Flayout-responsive-margins-360.png">

	<img alt="" aria-describedby="columns-gutters-margins-figure-caption-6" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1-LhM4V-ShSU_5aGH7vWEjnLHmizNhAuA%2Flayout-responsive-margins-600.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1-LhM4V-ShSU_5aGH7vWEjnLHmizNhAuA%2Flayout-responsive-margins-600.png">

- Grid customization: Có thể được điều chỉnh để đáp ứng nhu cầu và kích cỡ thiết bị khác nhau.

<img alt="" aria-describedby="columns-gutters-margins-figure-caption-6" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1-LhM4V-ShSU_5aGH7vWEjnLHmizNhAuA%2Flayout-responsive-margins-600.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1-LhM4V-ShSU_5aGH7vWEjnLHmizNhAuA%2Flayout-responsive-margins-600.png">

<img alt="" aria-describedby="grid-customization-figure-caption-2" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1DFStWNqE_Ljf-d-vgQYmPvSjjlRluWmn%2Flayout-custom-gutters-too-large-dont.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1DFStWNqE_Ljf-d-vgQYmPvSjjlRluWmn%2Flayout-custom-gutters-too-large-dont.gif">

- Breakpoints: Là phạm vi kích thước màn hình. Với mỗi phạm vi breakpoint, layout được điều chỉnh để phù hợp với kích thước và hướng màn hình.

	<video class="video-player__video animatable js-video-player js-video-load anim-appear" loop="" muted="" preload="metadata" tabindex="0">
<source data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1fsdEL9VNAeJaQjU-bdzLZnZ2IuoPEpYT%2Flayout-responsive-breakpoints.mp4" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1fsdEL9VNAeJaQjU-bdzLZnZ2IuoPEpYT%2Flayout-responsive-breakpoints.mp4" type="video/mp4"> </video>

	+ Layout sử dụng lưới 4-column, 8-column, 12-column có sẵn để sử dụng trên các màn hình.
	<img src="images/breakpoints_system.png"/>

- Grid behavior:
	+ Fluid grids

<img alt="" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1BL9SdFCf9qek6sZVtiOwmbGb5YcuatRy%2Flayout-responsive-grid-behavior-fluid.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1BL9SdFCf9qek6sZVtiOwmbGb5YcuatRy%2Flayout-responsive-grid-behavior-fluid.gif">

	+ Fixed grids

<img alt="" aria-describedby="grid-behavior-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1ecGfk1w3yeUP9eck81D3Qh1kSPA_pusx%2Flayout-responsive-grid-behavior-fixed.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1ecGfk1w3yeUP9eck81D3Qh1kSPA_pusx%2Flayout-responsive-grid-behavior-fixed.gif">

- UI regions: UI được tạo thành từ các thành phần như navigation, content areas, app bar,...
	+ Permanent UI regions (Vùng UI cố định)

<img alt="" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1LCMRi7tODKHMyKFAPm-kz4M4Jy9xnATZ%2Flayout-responsive-uiregions-permenant.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1LCMRi7tODKHMyKFAPm-kz4M4Jy9xnATZ%2Flayout-responsive-uiregions-permenant.png">

	+ Persistent UI regions (Vùng UI liên tục)

<img alt="" aria-describedby="ui-regions-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1okgD4gBMG30TClLHE_nJuMdwb3WFokyJ%2Flayout-responsive-uiregions-persistent.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1okgD4gBMG30TClLHE_nJuMdwb3WFokyJ%2Flayout-responsive-uiregions-persistent.gif">

	+ Temporary UI regions (Vùng UI tạm thời)

<img alt="" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1Y2cQ0buTC-_HzEZZ4DdpbbCUh2qHbgDk%2Flayout-responsive-uiregions-temporary.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1Y2cQ0buTC-_HzEZZ4DdpbbCUh2qHbgDk%2Flayout-responsive-uiregions-temporary.gif">

## Spacing method
- Baseline:
	+ 8dp: Tất cả các thành phần phù hợp với lưới baseline 8dp cả mobile, tablet, desktop
	
<img alt="" aria-describedby="baseline-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1pZAqRhNtwhgKNf_JMuwNgC_uQaGUeV1X%2Flayout-spacing-baslinegrid.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1pZAqRhNtwhgKNf_JMuwNgC_uQaGUeV1X%2Flayout-spacing-baslinegrid.png">

	+ 4dp: icon, typography và một số thành phần có thể căn chỉnh theo grid 4dp.
	
<img alt="" aria-describedby="baseline-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="33.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F18NDMry_mNrQ5kMbkVLuklltSbYeEIiG8%2Flayout-spacing-4dp-baslinegrid.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F18NDMry_mNrQ5kMbkVLuklltSbYeEIiG8%2Flayout-spacing-4dp-baslinegrid.png">

- Spacing:
	+ keyline: Cho phép vị trí nhất quán của các thành phần bên ngoài layout grid. Là các đường thẳng đứng được xác định từ mép màn hình, đo theo gia số 8dp. Nên được sử dụng kết hợp với *responsive layout grid* để đặt các yếu tố nhất quán trong một thiết kế.
	
<img alt="" aria-describedby="spacing-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="76.3157894737%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1tFVHB61zE5yb0JNU3dEtya_GeUyQWqn5%2Flayout-spacing-keylinespadding-keylines.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1tFVHB61zE5yb0JNU3dEtya_GeUyQWqn5%2Flayout-spacing-keylinespadding-keylines.png">

	+ padding: Không gian giữa các thành phần UI, thay thế cho keyline được đo theo gia số 8dp hoặc 4dp.

	<img alt="" aria-describedby="spacing-figure-caption-3" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1qRYD4sWHoSQs_Gg6jx5Xt_3TYp2CM-5d%2Flayout-spacing-keylinespadding-padding-verthorz.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1qRYD4sWHoSQs_Gg6jx5Xt_3TYp2CM-5d%2Flayout-spacing-keylinespadding-padding-verthorz.png">

	+ vertical spacing: Đề cập đến chiều cao của một phần tử, độ cao phù hợp với grid 8dp.
	
<img alt="" aria-describedby="spacing-figure-caption-4" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1ukHGXtjoW-SxqTzYegljgtCi3JHsSFmm%2Flayout-spacing-keylinespadding-verticalspacing.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1ukHGXtjoW-SxqTzYegljgtCi3JHsSFmm%2Flayout-spacing-keylinespadding-verticalspacing.png">

	+ increment: Là một phép đo được sử dụng để đo kích thước và vị trí của các thành phần. Là hình vuông có kích thước bất kỳ, nên sử dụng chiều cao của một phần tử tiêu chuẩn (app bar).

<img alt="" aria-describedby="spacing-figure-caption-5" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1HNf_5p84x3WNVxrs0T2iOqjGXCwRaVIt%2Flayout-spacing-increments-example.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1HNf_5p84x3WNVxrs0T2iOqjGXCwRaVIt%2Flayout-spacing-increments-example.png">

- Containers và ratios.
	+ container: là một hình dạng được sử dụng đại diện cho một khu vực, có thể fix cứng hoặc co kéo theo nội dung.
	
<img alt="" aria-describedby="containers-aspect-ratios-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1EfIrWcBPIOi6i7eCpoqd-kioV8H-Asbu%2Flayout-spacingmethods-containers.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1EfIrWcBPIOi6i7eCpoqd-kioV8H-Asbu%2Flayout-spacingmethods-containers.gif">

	+ ratios: Là tỉ lệ chiều rộng so với chiều cao của phần tử. Để duy trì tính nhất quán trong bố cục, các tỷ lệ khung hình sau được khuyến khích sử dụng.

<img alt="" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1AjZXUtHEYC-FEwEjcp4xbXqNHMeloLEF%2Flayout-unitsmeasurements-dev-aspectratio.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1AjZXUtHEYC-FEwEjcp4xbXqNHMeloLEF%2Flayout-unitsmeasurements-dev-aspectratio.png">

- Touch and click targets:
	+ Touch target specs: Để cân bằng mật độ thông tin và khả năng sử dụng, các mục tiêu cảm ứng nên có ít nhất 48x48 dp với khoảng cách không gian giữa chúng ít nhất 8dp.

<img alt="" aria-describedby="touch-targets-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="34.2105263158%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1V-52jQzdoLsqxrz_JMp20Zbp_a2Zc2gp%2Flayout-spacing-touchtargets.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1V-52jQzdoLsqxrz_JMp20Zbp_a2Zc2gp%2Flayout-spacing-touchtargets.png">

	+ Click targets: Kích thước tối thiểu là 24x24 dp với spacing ít nhất là 8dp
	
<img alt="" aria-describedby="touch-targets-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="36.8421052632%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1CCpcUPwnMC-r-tT-cDz8U8J6PzkGBtkc%2Flayout-spacing-clicktargets.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1CCpcUPwnMC-r-tT-cDz8U8J6PzkGBtkc%2Flayout-spacing-clicktargets.png">

## Component behavior
- Component width: 
	+ Có thể giữ nguyên hoặc thay đổi kích thước theo bố cục: fixed, fluid

<img alt="" aria-describedby="component-width-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F11dS_5T4T7m27ryPpYnIh5yM6hcCRDY8K%2Flayout-element-behavior-fixed-width.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F11dS_5T4T7m27ryPpYnIh5yM6hcCRDY8K%2Flayout-element-behavior-fixed-width.gif">

<img alt="" aria-describedby="component-width-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1W3mrTN71O4IH1knmIJv0EXHVy9Y2fppd%2Flayout-element-behavior-fluid-width.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1W3mrTN71O4IH1knmIJv0EXHVy9Y2fppd%2Flayout-element-behavior-fluid-width.gif">

<img alt="" aria-describedby="component-width-figure-caption-2" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1RslR2Zd6aGip8ndBN4cZuYmVxykE8bzE%2Flayout-element-behavior-fluid-dont-01.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1RslR2Zd6aGip8ndBN4cZuYmVxykE8bzE%2Flayout-element-behavior-fluid-dont-01.gif">

	+ Các thành phần được fixed width được giữ nguyên khi thay đổi bố cục, có thể thay đổi vị trí để phù hợp với bố cục mới: pushed, Overlaid

<img alt="" aria-describedby="component-width-figure-caption-4" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1qUtj2oEv4Q40P1wVrlePjxmmK-emW99g%2Flayout-element-behavior-push.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1qUtj2oEv4Q40P1wVrlePjxmmK-emW99g%2Flayout-element-behavior-push.gif">

<img alt="" aria-describedby="component-width-figure-caption-5" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.7704918033%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F11ZQxUyZvmrd5cxsDs73k09KcVrgTuaUE%2Flayout-element-behavior-overlaid.gif" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F11ZQxUyZvmrd5cxsDs73k09KcVrgTuaUE%2Flayout-element-behavior-overlaid.gif">

- Responsive patterns
	- Các thành phần có thể điều chỉnh kích thước của chúng dựa trên kích thước màn hình và loại thiết bị, chẳng hạn như:
	+ Các thành phần giao diện ẩn đi với màn hình nhỏ có thể hiển thị đối với màn hình lớn
	
<img alt="" aria-describedby="responsive-patterns-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1eEEDI_xEyFFa6y-_yyRxyP-TpgsPb2Pr%2Flayout-responsive-patterns-reveal-navdrawer.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1eEEDI_xEyFFa6y-_yyRxyP-TpgsPb2Pr%2Flayout-responsive-patterns-reveal-navdrawer.png">

	+ Chuyển thành phần từ dạng này sang dạng khác khi ở màn hình lớn
	
<img alt="" aria-describedby="responsive-patterns-figure-caption-3" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1vz5WkJG9K_dyBrfJHekJ8c5Wsol-yN9O%2Flayout-responsive-patterns-transform-navdrawer.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1vz5WkJG9K_dyBrfJHekJ8c5Wsol-yN9O%2Flayout-responsive-patterns-transform-navdrawer.png">

	+ Có thể hiển thị nhiều thành phần cùng một lúc nếu có không gian
	
<img alt="" aria-describedby="responsive-patterns-figure-caption-6" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1oIscQOmfgUeVn7YHdm4j103W8K3SONg_%2Flayout-responsive-patterns-transform-divide-1.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1oIscQOmfgUeVn7YHdm4j103W8K3SONg_%2Flayout-responsive-patterns-transform-divide-1.png">

	+ Thay đổi bố cục nếu có không gian

<img alt="" aria-describedby="responsive-patterns-figure-caption-9" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1VXqd6WD0BvreENnNk0g_dqtyUv8rAMsT%2Flayout-responsive-patterns-transform-reflow-2.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1VXqd6WD0BvreENnNk0g_dqtyUv8rAMsT%2Flayout-responsive-patterns-transform-reflow-2.png">

	+ Mở rộng thành phần nếu có nhiều không gian
	
<img alt="" aria-describedby="responsive-patterns-figure-caption-12" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1apntZGLUuUlSkhpnTJe2ikMeTIFP1cKJ%2Flayout-responsive-patterns-transform-expand-2.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1apntZGLUuUlSkhpnTJe2ikMeTIFP1cKJ%2Flayout-responsive-patterns-transform-expand-2.png">

	+ Thay đổi vị trí của các thành phần UI phù hợp với kích thước màn hình
	
<img alt="" aria-describedby="responsive-patterns-figure-caption-13" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="73.6842105263%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1pmCqvMVPajmoDsmxmL-JBz4zqy88dSEa%2Flayout-responsive-patterns-transform-position-1.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1pmCqvMVPajmoDsmxmL-JBz4zqy88dSEa%2Flayout-responsive-patterns-transform-position-1.png">

## Applying density
- Việc áp dụng density giúp người dùng có nhìn thấy nhiều thông tin hơn và thao tác với lượng lớn dữ liệu hơn chẳng hạn như danh sách, bảng, biểu mẫu.
<img src="images/apply_density.png"/>
- Nguyên tắc:
	+ Dễ quan sát: Cải thiện trình duyệt và tương tác với số lượng lớn nội dung.
	+ Độ ưu tiên: Giúp người dùng tập trung bằng cách giảm không gian giữa các hành động.
	+ Tính có sẵn: Mật độ hiển thị nhiều nội dung và hành động trên một màn hình.
### Khi nào nên áp dụng density
- Các thành phần có mật độ cao cho phép user tương tác với lượng thông tin nhiều hơn. Danh sách, bảng, các biểu mẫu dài phù hợp để áp dụng density

<img alt="" aria-describedby="usage-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1YKHvHftsbsUjMdrUh0ilymDUZdWEnXMV%2Flayout-density-rows.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1YKHvHftsbsUjMdrUh0ilymDUZdWEnXMV%2Flayout-density-rows.png">

<img alt="" aria-describedby="usage-figure-caption-1" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1hUoPi8ZbKsQ7VQGknaPYEe03mw1Gbhc9%2Flayout-density-forms.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1hUoPi8ZbKsQ7VQGknaPYEe03mw1Gbhc9%2Flayout-density-forms.png">

### Khi nào không nên áp dụng density
- Không nên áp dụng cho các thành phần tasks hoặc alert-based

<img alt="" aria-describedby="usage-figure-caption-3" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="47.3684210526%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1TenJuiDEbAnfKRFPv0qr60ViZHTm7UtP%2Ffocused-tasks-dont.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1TenJuiDEbAnfKRFPv0qr60ViZHTm7UtP%2Ffocused-tasks-dont.png">

<img alt="" aria-describedby="usage-figure-caption-4" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="34.2105263158%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1wIvFCZUgDcycFdMbSppyAV1701N0ewMw%2Falerts-dont.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1wIvFCZUgDcycFdMbSppyAV1701N0ewMw%2Falerts-dont.png">

### Typographic debsity
- Line height: là khoảng cách giữa các dòng text. Có thể được sử dụng như 1 cách để tạo mật độ trong typographic layouts. Đảm bảo vẫn sử dụng lưới cơ sở 4dp.

<img alt="" aria-describedby="typographic-density-figure-caption-0" class="lightbox__image zoom-target js-zoom-target js-lightbox-image inline-image animatable lazy-wrapper__image js-lazy-image anim-appear" data-aspect-ratio="50.0%" data-src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1Mu565sAKVIRQVQSNxbKNLBKiewkwI-ge%2Flayout-line-height-1.png" src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1Mu565sAKVIRQVQSNxbKNLBKiewkwI-ge%2Flayout-line-height-1.png">

# Motion
## Understanding motion
- Motion giúp định hướng người dùng bằng cách hiển thị các thành phần có liên quan với nhau: https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1DenoCsHNb_H1S1zErzmGCxhz6wjmdO8y%2F01-hierarchy-parentchild.mp4

- Motion cung cấp phản hồi kịp thời và trạng thái của hành động người dùng: src="https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1G-MNFco8ApWpcnN5hkbiS2QnK1f1jW-Z%2F02-feedback-password.mp4

- Motion giúp hướng dẫn người dùng cách thực hiện các hành động: https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F1FhotRqhTI6ITEzsJnI6RUl4CRa9FlAay%2F03-usereducation-gesture.mp4

- Motion tạo sự thu hút người dùng tương tác với app: https://storage.googleapis.com/spec-host/mio-staging%2Fmio-design%2F1563837804615%2Fassets%2F19Ms-MRmEZ2cGQNicpePPRjHxxa0NkxIm%2F04-juggler.mp4

- Motion hướng sự chú ý của người dùng một cách trơn tru, không bị gián đoạn. Khi UI thay đổi, motion cung cấp tính liên tục giữa các yếu tố trước và sau. Tính liên tục được thể hiện bằng một hoặc nhiều kỹ thuật sau:
	+ Tweening (FAB): Áp dụng cho 1 thành phần hoặc thành phần theo thời gian
	+ Fading (mờ dần): Ví dụ chuyển đổi giữa các hình ảnh.
	+ Shared transformation
- Tham khảo thêm về các kỹ thuật: https://material.io/design/motion/understanding-motion.html#expressing-continuity

## Nguyên tắc Animation trong Material Design
- Tất cả các thành phần giao diện phải phù hợp với logic tổng thể duy nhất.
	+ Tạo ra một user flow ảnh hưởng đáng kể tới trải nghiệm người dùng trong ngữ cảnh của ứng dụng.
	+ Easing một công cụ làm cho animation được cảm nhận theo cách tự nhiên hơn (CoordinatorLayout và CollapsingToolbarLayout)

<img class="ly lz gp p q go ae gm" width="700" height="525" src="https://miro.medium.com/max/700/1*UOFtfASaoslBm62FWr9Nkg.gif">

- Đảm bảo các thành phần tăng tốc dần dần và làm chậm
	+ Làm cho quá trình chuyển đổi liền mạch, hợp lý và thực tế.
- Tận dụng các icon animations
	+ Một cách tiếp cận mới mẻ, tạo ra ảnh hưởng tích cực đến cả dịch vụ

<img class="mg mh go n o gn ab gl" width="700" height="525" src="https://miro.medium.com/max/700/1*RZO86BqcHl9u9LN4oIJ6AQ.gif">

- Tạo thời gian khác nhau cho các mục chuyển động khác nhau
	+ Việc trình bày tất cả các thành phần cùng 1 lúc khiến người dùng mất tập trung, không nhận ra nơi nào cần focus.
- Sự dịch chuyển đối tượng phải được phối hợp theo cùng một hướng

<img class="mg mh go n o gn ab gl" width="600" height="450" src="https://miro.medium.com/max/600/1*qiYzKkv4Tp0rFdHYfUj4gA.gif">

- Tất cả các item sẽ có hiệu ứng khi chạm vào.
- Xây dựng một sự chuyển giao mượt mà từ trang này sang trang khác.

<img class="mg mh go n o gn ab gl" width="700" height="525" src="https://miro.medium.com/max/700/1*KMSBo46IhwPf9m3bMijFZA.gif">

- Hiệu ứng hình ảnh
- Xác định những thành phần nào cần phải focus trước khi tạo animation
- Duration
	+ 200-500ms là tốc độ animation tốt nhất

<img class="mg mh go n o gn ab gl" width="700" height="525" src="https://miro.medium.com/max/700/1*MeE8FiUThQy341emVDTbCQ.gif">

# Tài liệu tham khảo
- https://material.io/design/layout/applying-density.html#usage
- https://uxplanet.org/10-principles-of-animation-in-material-design-53b870e74629
- https://proandroiddev.com/playing-with-material-design-transitions-b3ea90c5794c
- https://builttoadapt.io/intro-to-the-8-point-grid-system-d2573cde8632

